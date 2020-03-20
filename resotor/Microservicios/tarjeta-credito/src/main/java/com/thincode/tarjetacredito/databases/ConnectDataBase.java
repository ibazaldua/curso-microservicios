package com.thincode.tarjetacredito.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.mariadb.jdbc.Driver;

public class ConnectDataBase {
	
	static String url = "jdbc:mysql://localhost:3306/cursojava";
	static Connection con;
	
	public static Connection connectDataBase() {
		Connection conexion = null;
		if(con == null) {
			try {
				DriverManager.registerDriver(new Driver());
				con = DriverManager.getConnection(url, "root", "");
				conexion = con;
				System.out.println("Conecte");
			} catch (SQLException e) {
				System.out.println("No Conecte");
			}
		}else {
			conexion = con;
			System.out.println("Regreso conexion existente");
		}
		return conexion;
		
	}
	
	public static void closeConnection() {
		try {
			con.close();
			con = null;
			System.out.println("Cierro conexion");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}
