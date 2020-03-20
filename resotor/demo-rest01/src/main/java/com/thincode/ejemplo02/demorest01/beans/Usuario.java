package com.thincode.ejemplo02.demorest01.beans;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString.Exclude;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	private String usuario;
	private String nombre;
	private String correo;
	//private Date fechaNAcimineto;
	@Exclude
	private String password;
	private Integer edad;

}
