package com.thincode.ejemplo3.tarjetacredito.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.thincode.ejemplo3.tarjetacredito.service.TarjetaCredito;
import com.thincode.ejemplo3.tarjetacredito.beans.Tarjeta;


@RestController
public class ControlTarjetaCredito {
	
	@Autowired
	private TarjetaCredito tarjetaCredito;
	
	
	@GetMapping("/version")
	public String version() {
		return "Rest Tarjeta Credito";
	}
	
	@GetMapping("/consulta-t-credito/{cliente}")
	public ResponseEntity<ArrayList<Tarjeta>> consulta(@PathVariable int cliente){
		ArrayList<Tarjeta> lTar = new ArrayList<Tarjeta>();
		lTar = tarjetaCredito.consultaCliente(cliente);
		return new ResponseEntity<ArrayList<Tarjeta>>(lTar, HttpStatus.OK);
	}


	
	
}
