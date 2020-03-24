package com.thincode.ejemplo3.estadocuenta.client;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;

@FeignClient(name = "tarjeta-credito", url = "localhost:8083", fallback = FallBackCredito.class)
public interface ProductoCreditoRest {

	@GetMapping("/version")
	public String versionCredito();
	
	
	@GetMapping("/consulta-t-credito/{cliente}")
	public ResponseEntity<ArrayList<Tarjeta>> consultaCredito(@PathVariable int cliente);
}
