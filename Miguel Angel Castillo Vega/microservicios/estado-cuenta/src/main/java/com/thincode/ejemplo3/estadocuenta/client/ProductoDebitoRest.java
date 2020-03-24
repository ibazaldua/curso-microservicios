package com.thincode.ejemplo3.estadocuenta.client;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;

@FeignClient(name = "tarjeta-debito", url = "localhost:8082", fallback = FallBackDebito.class)
public interface ProductoDebitoRest {
	
	@GetMapping("/version")
	public String versiondebito();
	
	
	@GetMapping("/consulta-t-debito/{cliente}")
	public ResponseEntity<ArrayList<Tarjeta>> consultaDebito(@PathVariable int cliente);

}
