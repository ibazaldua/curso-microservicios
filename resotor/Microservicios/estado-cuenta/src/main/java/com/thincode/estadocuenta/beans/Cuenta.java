package com.thincode.estadocuenta.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
	private String numCuenta;
	private String tipoCuenta;
	private Double saldo;

}
