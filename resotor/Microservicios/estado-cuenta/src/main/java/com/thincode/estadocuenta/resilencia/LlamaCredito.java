package com.thincode.estadocuenta.resilencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thincode.estadocuenta.beans.Cuenta;

@Component
public class LlamaCredito {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${constants.url.Credito}")
	private String urlCredito /* = "http://tarjeta-credito-resotor/consultaCuentas/"*/;
	
	@HystrixCommand(fallbackMethod = "conexionCreditoDefault")
	public List<Cuenta> conexionCredito(Integer cliente){
		return conexionServicios(urlCredito+cliente);
	}
	
	public List<Cuenta> conexionCreditoDefault(Integer cliente,Throwable exp){
		return null;
	}
	
	public List<Cuenta> conexionServicios(String url){
		List<Cuenta> regreso = null;
		ResponseEntity<Cuenta[]> response =restTemplate.getForEntity(url, Cuenta[].class);
		if(response.getStatusCode() == HttpStatus.OK) {
			regreso = convierteLista(response.getBody());
		}
		return regreso;
	}
	
	private List<Cuenta> convierteLista(Cuenta[] array){
		List<Cuenta> lista = new ArrayList<>(); 
		for(Cuenta cuenta: array) {
			lista.add(cuenta);
		}
		return lista;
	}

}
