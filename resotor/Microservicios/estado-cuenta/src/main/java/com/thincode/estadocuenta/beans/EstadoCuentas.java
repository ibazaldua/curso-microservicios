package com.thincode.estadocuenta.beans;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoCuentas {
	private Integer cliente;
	private String nombre;
	private List<Cuenta> cuentas;

}
