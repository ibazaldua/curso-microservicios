package com.thincode.ejercicio3;

public class Usuario {
	int id;
	String nombre;
	String correo;
	String fecha;
	int edad;
	
	public Usuario(int id, String nombre,String correo,String fecha, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.fecha = fecha;
		this.edad = edad;
	}
	
	public String toString() {
		return id + " " + nombre + " " + correo + " " + fecha + " " + edad;
	}

}
