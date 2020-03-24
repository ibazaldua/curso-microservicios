package com.thincode.ejemplo3.estadocuenta.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarjeta {
	
	private int Nocliente;
	private String nombre;
	private int noCuenta;
	private String tipoCuenta;
	private Double saldo;
	
	

}
