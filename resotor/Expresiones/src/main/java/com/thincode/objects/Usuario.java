package com.thincode.objects;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {
	
	private Integer id;
	private String nombre;
	private Integer edad;
	private String fechaNacimiento;
	private String correo;

}
