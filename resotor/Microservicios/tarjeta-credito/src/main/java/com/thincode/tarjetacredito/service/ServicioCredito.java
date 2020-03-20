package com.thincode.tarjetacredito.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thincode.tarjetacredito.beans.Cuenta;
import com.thincode.tarjetacredito.databases.ConnectDataBase;

@Service
public class ServicioCredito {
	
	public List<Cuenta> dameCuentas(Integer cliente){
		Connection conexion = ConnectDataBase.connectDataBase();
		List<Cuenta> cuentas =  new LinkedList<Cuenta>();
		try {
			PreparedStatement ps = conexion.prepareStatement("SELECT cuenta,tipocuenta,saldo FROM tarjetacredito WHERE cliente = ?");
			ps.setInt(1,cliente);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				cuentas.add(new Cuenta(result.getString("cuenta"),result.getString("tipocuenta"),result.getDouble("saldo")));
			}
		} catch (SQLException e) {
			cuentas = null;
			e.printStackTrace();
		}
		
		return cuentas;
	}

}
