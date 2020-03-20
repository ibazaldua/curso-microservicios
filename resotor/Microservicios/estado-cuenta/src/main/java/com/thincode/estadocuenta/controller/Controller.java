package com.thincode.estadocuenta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.thincode.estadocuenta.beans.EstadoCuentas;
import com.thincode.estadocuenta.service.ConsultaServicios;

@RestController
public class Controller {
	
	@Value("${constants.version}")
	private String version;
	
	@Autowired
	ConsultaServicios servicio;
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Bienvenido a Estados de Cuenta V " + version;
	}
	
	@GetMapping("/estadoDeCuenta/{cliente}")
	public ResponseEntity<EstadoCuentas> estadoCuenta(@PathVariable("cliente") Integer cliente){
		return servicio.generaEstadoCuenta(cliente);
	}

}
