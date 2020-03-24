package com.thincode.ejemplo3.estadocuenta.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.thincode.ejemplo3.estadocuenta.service.ServicioEstadoCuenta;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;


@RestController
public class ControlEstadoCuenta {
	
	@Autowired
	private ServicioEstadoCuenta estadosCuenta;
	
	@Value("${constants.version}")
	private String version;
	
	@GetMapping("/version")
	public String version() {
		return "Version " + version;
	}

	
	@GetMapping("/consulta-estado-cuenta")
	public ResponseEntity<ArrayList<Tarjeta>> consulta(@RequestParam (value = "cliente") int cliente){
			return estadosCuenta.consulta(cliente);
	}

	
	
}
