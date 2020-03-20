package com.thincode.ejemplo02.demorest01.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thincode.ejemplo02.demorest01.beans.Usuario;
import com.thincode.ejemplo02.demorest01.logic.AdministraUsuarios;

@RestController
public class Controller {
	
	@Autowired
	AdministraUsuarios users;
	
	@Value("${constants.version}")
	String version="0";
	
	
	@GetMapping("/version")
	public String version() {
		return "Spring V "+version;
	}
	
	@GetMapping("/usuario")
	public Usuario usuario(){
		return new Usuario("resotor","René Erick","resotor@outlook.com","1234",26);
	}
	
	@PostMapping("/usuario")
	public Usuario usuarioPost(@RequestBody Usuario usuario) {
		usuario.setCorreo("rene.soto@thincode.com");
		return usuario;
	}
	
	@PostMapping("/altaUsuario")
	public String altaUsuario(@RequestBody Usuario usuario) {
		String regreso = new String();
		if(users.altaUsuario(usuario)) regreso = "Usuario agregado!!";
		else regreso = "Error al dar de alta el usuario";
		return regreso;
	}
	
	@PutMapping("/cambiaUsuario/{user}")
	public String cambiaUsuario(@PathVariable(value = "user") String user,@RequestBody Usuario usuario) {
		String regreso = new String();
		if(users.cambiaUsuario(user,usuario)) regreso = "Usuario modificado!!";
		else regreso = "Error al cambiar el usuario";
		return regreso;
	}
	
	@GetMapping("/Usuario/{user}")
	public Usuario dameUsuario(@PathVariable(value = "user") String user) {
		System.out.println("Voy por "+user);
		return users.dameUsuario(user);
	}
	
	@GetMapping("/Usuarios")
	public List<Usuario> dameUsuarios() {
		return users.dameUsuarios();
	}
	
	@DeleteMapping("/borraUsuario/{user}")
	public String borraUsuario(@PathVariable(value = "user") String user) {
		String regreso = new String();
		System.out.println("Borrare por "+user);
		if(users.borraUsuario(user)) regreso = "Usuario: " +user+" eliminado!!";
		else regreso = "No se pudo borrar el usuario: "+ user;
		return regreso;
	}
	

}
