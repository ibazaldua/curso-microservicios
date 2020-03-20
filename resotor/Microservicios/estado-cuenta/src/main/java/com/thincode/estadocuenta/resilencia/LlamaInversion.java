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
public class LlamaInversion {
	
	@Value("${constants.url.Inversion}")
	private String urlInversion;

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "conexionInversionDefault")
	public List<Cuenta> conexionInversion(Integer cliente){
		return conexionServicios(urlInversion+cliente);
	}
	
	public List<Cuenta> conexionInversionDefault(Integer cliente,Throwable exp){
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
