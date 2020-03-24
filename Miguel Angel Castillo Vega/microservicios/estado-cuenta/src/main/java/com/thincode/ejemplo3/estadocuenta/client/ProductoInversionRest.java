package com.thincode.ejemplo3.estadocuenta.client;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;

@FeignClient(name = "inversion", url = "localhost:8084", fallback = FallBackInversion.class)
public interface ProductoInversionRest {

	@GetMapping("/version")
	public String versionInversion();
	
	@GetMapping("/consulta-inversion/{cliente}")
	public ResponseEntity<ArrayList<Tarjeta>> consultaInversion(@PathVariable int cliente);

	
	
}
