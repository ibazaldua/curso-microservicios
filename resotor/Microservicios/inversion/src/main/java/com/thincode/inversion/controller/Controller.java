package com.thincode.inversion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.thincode.inversion.beans.Cuenta;
import com.thincode.inversion.service.ServicioInversion;

@RestController
public class Controller {
	
	@Autowired
	ServicioInversion servicio;
	
	@GetMapping("/consultaCuentas/{cliente}")
	public ResponseEntity<List<Cuenta>> consultaCuentas(@PathVariable("cliente") Integer cliente){
		List<Cuenta> cuentas = servicio.dameCuentas(cliente);
		HttpStatus status;
		if(cuentas != null) {
			status = HttpStatus.OK;
		}else {
			status = HttpStatus.NOT_FOUND;
		}
		return new ResponseEntity<List<Cuenta>>(cuentas,status);
	}

}
