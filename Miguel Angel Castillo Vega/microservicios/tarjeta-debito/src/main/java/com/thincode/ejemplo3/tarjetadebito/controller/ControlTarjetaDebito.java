package com.thincode.ejemplo3.tarjetadebito.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thincode.ejemplo3.tarjetadebito.beans.Tarjeta;
import com.thincode.ejemplo3.tarjetadebito.service.TarjetaDebito;


@RestController
public class ControlTarjetaDebito {
	
	@Autowired
	private TarjetaDebito tarjetaDebito;

	@GetMapping("/version")
	public String version() {
		return "Rest Tarjeta debito";
	}
	
	@GetMapping("/consulta-t-debito/{cliente}")
	public ResponseEntity<ArrayList<Tarjeta>> consulta(@PathVariable int cliente){
		System.out.println("llego a consulta debito " + cliente);
		ArrayList<Tarjeta> lTar;
		lTar = tarjetaDebito.consultaCliente(cliente);
		return new ResponseEntity<ArrayList<Tarjeta>>(lTar, HttpStatus.OK);
	}

	
	
}
