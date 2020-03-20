package com.thincode.estadocuenta.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thincode.estadocuenta.beans.Cuenta;
import com.thincode.estadocuenta.beans.EstadoCuentas;
import com.thincode.estadocuenta.resilencia.LlamaCredito;
import com.thincode.estadocuenta.resilencia.LlamaDebito;
import com.thincode.estadocuenta.resilencia.LlamaInversion;
import com.thincode.tarjetadebito.databases.ConnectDataBase;

@Service
public class ConsultaServicios {
	
	private LlamaCredito credito;
	private LlamaDebito debito;
	private LlamaInversion inversion;
	
	@Autowired
	public ConsultaServicios(LlamaCredito credito,LlamaDebito debito,LlamaInversion inversion) {
		this.credito = credito;
		this.debito = debito;
		this.inversion = inversion;
	}

	public ResponseEntity<EstadoCuentas> generaEstadoCuenta(Integer cliente) {
		EstadoCuentas cuentas = new EstadoCuentas();
		List<Cuenta> repository = new ArrayList<Cuenta>();
		List<Cuenta> cuentasAux;
		cuentas.setCliente(cliente);
		cuentas.setNombre(consultaNombre(cliente));
		HttpStatus status  = HttpStatus.OK;
		// Va por Debito
		cuentasAux = debito.conexionDebito(cliente);
		if(cuentasAux != null)
			for(Cuenta cuen: cuentasAux) repository.add(cuen);
		// Va por Credito
		cuentasAux = credito.conexionCredito(cliente);
		if(cuentasAux != null)
			for(Cuenta cuen: cuentasAux) repository.add(cuen);
		// Va por Inversion
		cuentasAux = inversion.conexionInversion(cliente);
		if(cuentasAux != null)
			for(Cuenta cuen: cuentasAux) repository.add(cuen);
		if(!repository.isEmpty()) {
			cuentas.setCuentas(repository);
		}
		return new ResponseEntity<EstadoCuentas>(cuentas,status);
	}
	
	public String consultaNombre(Integer cliente) {
		Connection conexion = ConnectDataBase.connectDataBase();
		String nombre = null;
		try {
			PreparedStatement ps = conexion.prepareStatement("SELECT nombre FROM clientes WHERE cliente = ?");
			ps.setInt(1,cliente);
			ResultSet result = ps.executeQuery();
			result.next();
			nombre = result.getString("nombre");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nombre;
	}

}
