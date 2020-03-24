package com.thincode.ejemplo2.demorest01.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Usuario {

	private String usuario;
	private String nombre;
	private String password;
	private String correo;
	private Date fecha;
	private int edad;
}
