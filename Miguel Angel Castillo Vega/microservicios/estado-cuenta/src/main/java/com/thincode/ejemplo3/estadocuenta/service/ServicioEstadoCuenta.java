package com.thincode.ejemplo3.estadocuenta.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;
import com.thincode.ejemplo3.estadocuenta.client.FallBackInversion;
import com.thincode.ejemplo3.estadocuenta.client.ProductoCreditoRest;
import com.thincode.ejemplo3.estadocuenta.client.ProductoDebitoRest;
import com.thincode.ejemplo3.estadocuenta.client.ProductoInversionRest;

@Service
public class ServicioEstadoCuenta {
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ProductoInversionRest inversionFeign;
	@Autowired
	private ProductoCreditoRest creditoFeign;
	@Autowired
	private ProductoDebitoRest debitoFeign;
	
	public ResponseEntity<ArrayList<Tarjeta>> consulta(int cliente){
		

		HttpStatus status =  null;
		
		Map<String,Integer> pathVariables = new HashMap<String,Integer>();
		pathVariables.put("cliente", cliente);
		ArrayList<Tarjeta> concentradora = new ArrayList<Tarjeta>();
		
		
		ResponseEntity<ArrayList<Tarjeta>>respuestaFeignDebi = debitoFeign.consultaDebito(cliente);
		System.out.println("regreso de debito");
		
		if(respuestaFeignDebi.getStatusCode() == HttpStatus.OK) {
			concentradora.addAll(respuestaFeignDebi.getBody());
			status = HttpStatus.OK;
		}
		
		
		
		ResponseEntity<ArrayList<Tarjeta>>respuestaFeignCred = creditoFeign.consultaCredito(cliente);
	
		
		if(respuestaFeignCred.getStatusCode() == HttpStatus.OK) {
			concentradora.addAll(respuestaFeignCred.getBody());
			status = HttpStatus.OK;
		}

		
		
		ResponseEntity<ArrayList<Tarjeta>>respuestaFeignInv = inversionFeign.consultaInversion(cliente);
		System.out.println("regreso de inversion");
		
		if(respuestaFeignInv.getStatusCode() == HttpStatus.OK) {
			concentradora.addAll(respuestaFeignInv.getBody());
			status = HttpStatus.OK;
		}
		
		return new ResponseEntity<ArrayList<Tarjeta>>(concentradora, status);
		
		
	}


}
