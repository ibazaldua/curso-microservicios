package com.thincode.ejemplo2.demorest01.service;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.thincode.ejemplo2.demorest01.beans.Usuario;
import com.thincode.ejemplo2.demorest01.conector.ConectionBd;



@org.springframework.stereotype.Service
public class Service {
	private Statement bdCreate;
	private ConectionBd mariaBd;
	

	/*public Service() {
		ConectionBd mariaBd = new ConectionBd();
		bdCreate = mariaBd.create();
		System.out.println("Creo servicio bd");
	}*/
	
	public Service(ConectionBd mariaBd) {
		this.mariaBd = mariaBd;
		bdCreate = mariaBd.create();
		System.out.println("Creo servicio bd con autowired en la conexion");
	}
	
	//Se deberia pasar el usuario completo pero para mostrar que si vamos a buscar a la base
	// de datos solo mandamos el usuario
	public Usuario consultaUsuario(String usu) {
		Usuario usuario = null;
		String query = "SELECT * FROM USUARIOS WHERE USUARIO = '" +usu+ "'";

		ResultSet result = null;
		try {
			result = bdCreate.executeQuery(query);
			while(result.next()) {
				usuario = new Usuario(result.getString("USUARIO"),result.getString("NOMBRE"),result.getString("PASSWORD"),result.getString("CORREO"),result.getDate("FECHAALTA"),result.getInt("EDAD"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}
	
	public ArrayList<Usuario>  consultaAll() {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usu;
		ResultSet result = null;
		String query = "SELECT * FROM USUARIOS ";
		try {
			result = bdCreate.executeQuery(query);
			while(result.next()) {
				usu = new Usuario(result.getString("USUARIO"),result.getString("NOMBRE"),result.getString("PASSWORD"),result.getString("CORREO"),result.getDate("FECHAALTA"),result.getInt("EDAD"));
				usuarios.add(usu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;	
	}
	
	public String alta(Usuario usu) {
		
		int result = 0;
		String query = "INSERT INTO USUARIOS VALUES('" +
						usu.getUsuario() + "','" + usu.getNombre() + "','" +
						usu.getPassword() + "','" + usu.getCorreo() + "','" + "2020-03-19 06:49:21" + 
						"'," + usu.getEdad()+ ")";
		try {
			result = bdCreate.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se realizo alta");
		}
		
		if (result > 0) {
			return "La alta del usuario " + usu.getNombre() + " fue exitosa";
		}else {
		return "La alta del usuario " + usu.getNombre() + " no se realiazo";
		}
	}
	
	
	public String baja(Usuario usu) {
		
		int result = 0;
		String query = "DELETE FROM USUARIOS WHERE USUARIO = '" + usu.getUsuario() + "'";
		try {
			result = bdCreate.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result > 0) {
			return "Baja del usuario " +  usu.getNombre() + " realizada";
		}else {
			return "No se puede realizar la baja del usuario " + usu.getNombre();
		}
		
	}
	
	public Usuario actualiza(Usuario usu) {
		
		int result = 0;
		String query = "UPDATE USUARIOS SET NOMBRE = '" + usu.getNombre() + "', PASSWORD = '" +
						usu.getPassword() + "', CORREO = '" + usu.getCorreo() + "', EDAD = " + usu.getEdad() +
		" WHERE USUARIO = '" + usu.getUsuario() + "'";
		//String query = "UPDATE FROM USUARIOS SET NOMBRE = 'MIGUEL CASTILLO', PASSWORD = '12345', CORREO = 'JACMAC_9@HOTMAIL.COM', EDAD = 33 WHERE USUARIO = 'JACKO'";
		try {
			result = bdCreate.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return consultaUsuario(usu.getUsuario());
	}
}
