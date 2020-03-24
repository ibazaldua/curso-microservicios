package com.thincode.ejemplo2.demorest01.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.thincode.ejemplo2.demorest01.beans.Usuario;
import com.thincode.ejemplo2.demorest01.service.Service;

@RestController
public class Controller {
	private Service ser;
	
	
	public Controller(Service ser) {
		this.ser = ser;	
		System.out.println("Creo conexion con el servicio");
	}
	
	@GetMapping("/version")
	public String version() {
		return "Rest 1";
	}
	@GetMapping("/usuario")
	public Usuario usuario() {
		Date fecha = new Date();
		return new Usuario("Miguel","Miguel","jako","jacmac_9@hotmail.com",fecha,33);
	}
	
	@PostMapping("/usuario")
	public Usuario usuarioPost(@RequestBody Usuario usuario) {
		usuario.setCorreo("miguel.castillo@thincode.com");
		return usuario;
	}
	
	@GetMapping("/consultaAll")
	public ArrayList<Usuario> consultaAll(){
		return ser.consultaAll();
	}
	
	@GetMapping("/consulta")
	public Usuario consulta(@RequestBody String usuario) {
		return ser.consultaUsuario(usuario);
	}
	
	@PostMapping("/alta")
	public String alta(@RequestBody Usuario usuario) {
		return ser.alta(usuario);
	}
	
	@DeleteMapping("/baja")
	public String baja(@RequestBody Usuario usuario) {
		return ser.baja(usuario);
	}
	
	@PutMapping("/actualiza")
	public Usuario actualiza(@RequestBody Usuario usuario) {
		return ser.actualiza(usuario);
	}
}
