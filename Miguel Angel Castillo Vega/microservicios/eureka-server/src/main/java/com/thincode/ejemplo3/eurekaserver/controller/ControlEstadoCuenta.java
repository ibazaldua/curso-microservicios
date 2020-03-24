package com.thincode.ejemplo3.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEstadoCuenta {
	
	@GetMapping("/version")
	public String version() {
		return "Rest 1";
	}

}
