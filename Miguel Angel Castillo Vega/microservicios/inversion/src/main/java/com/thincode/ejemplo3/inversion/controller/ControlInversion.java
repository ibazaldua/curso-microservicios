package com.thincode.ejemplo3.inversion.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thincode.ejemplo3.inversion.service.Inversion;
import com.thincode.ejemplo3.inversion.beans.Tarjeta;


@RestController
public class ControlInversion {
	
	@Autowired
	private Inversion inversion;
	
	@GetMapping("/version")
	public String versionInversion() {
		return "Rest Tarjeta Credito";
	}
	
	@GetMapping("/consulta-inversion/{cliente}")
	public ResponseEntity<ArrayList<Tarjeta>> consultaInversion(@PathVariable int cliente){
		ArrayList<Tarjeta> lTar = new ArrayList<Tarjeta>();
		lTar = inversion.consultaCliente(cliente);
		
		
		return new ResponseEntity<ArrayList<Tarjeta>>(lTar, HttpStatus.OK);
	}
	
}
