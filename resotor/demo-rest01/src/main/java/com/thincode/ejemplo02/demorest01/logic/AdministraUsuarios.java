package com.thincode.ejemplo02.demorest01.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.thincode.ejemplo02.demorest01.beans.Usuario;
import com.thincode.ejemplo02.demorest01.database.ConnectDataBase;

@Service
public class AdministraUsuarios {
	
	public boolean altaUsuario(Usuario user) {
		boolean regreso;
		Connection con  = ConnectDataBase.connectDataBase();
		if(con != null) { 
			try {
				PreparedStatement ps = con.prepareStatement("INSERT INTO Usuarios(usuario,password,nombre,correo,edad) VALUES(?,?,?,?,?)");
				ps.setString(1,user.getUsuario());
				ps.setString(2,user.getPassword());
				ps.setString(3,user.getNombre());
				ps.setString(4,user.getCorreo());
				ps.setInt(5,user.getEdad());
				StringBuilder log = new StringBuilder();
				log.append("Se agregó: [").append(user.getUsuario()).append(",");
				log.append(user.getPassword()).append(",").append(user.getNombre()).append(",");
				log.append(user.getCorreo()).append(",").append(user.getEdad()).append("]");
				if(ps.executeUpdate() == 1) {
					System.out.println(log);
					regreso = true;
				}
				else {
					System.out.println("No se insertó");
					regreso = false;
				}
			} catch (SQLException e) {
				regreso = false;
				System.out.println(user.getUsuario()+" duplicado!!");
			}
		}
		else regreso = false;
		return regreso;
	}

	public boolean cambiaUsuario(String usuario, Usuario user) {
		boolean regreso;
		Connection con  = ConnectDataBase.connectDataBase();
		if(con != null) { 
			try {
				PreparedStatement ps = con.prepareStatement("UPDATE Usuarios SET password = ?,nombre = ?,correo = ?,edad = ? WHERE usuario = ?");
				ps.setString(5,user.getUsuario());
				ps.setString(1,user.getPassword());
				ps.setString(2,user.getNombre());
				ps.setString(3,user.getCorreo());
				ps.setInt(4,user.getEdad());
				StringBuilder log = new StringBuilder();
				log.append("Se modificó: [").append(user.getUsuario()).append(",");
				log.append(user.getPassword()).append(",").append(user.getNombre()).append(",");
				log.append(user.getCorreo()).append(",").append(user.getEdad()).append("]");
				if(ps.executeUpdate() == 1) {
					System.out.println(log);
					regreso = true;
				}
				else {
					System.out.println("No se insertó");
					regreso = false;
				}
			} catch (SQLException e) {
				regreso = false;
			}
		}
		else regreso = false;
		return regreso;

	}

	public Usuario dameUsuario(String user) {
		Connection con  = ConnectDataBase.connectDataBase();
		Usuario regreso = null;
		if(con != null) { 
			try {
				PreparedStatement ps = con.prepareStatement("SELECT usuario,password,nombre,correo,edad FROM USUARIOS WHERE usuario=?");
				ps.setString(1,user);
				ResultSet result = ps.executeQuery();
				while(result.next()) {
					regreso = new Usuario(result.getString("usuario"),result.getString("nombre"),result.getString("correo"),result.getString("password"),result.getInt("edad"));
					StringBuilder salida = new StringBuilder();
					salida.append(regreso.getUsuario()).append("[").append(regreso.getPassword()).append(",");
					salida.append(regreso.getNombre()).append(",").append(regreso.getCorreo()).append(",");
					salida.append(regreso.getEdad()).append(",").append("]");
					System.out.println(salida);
				}
			} catch (SQLException e) {
				regreso = null;
			}
		}else regreso = null;
		return regreso;
	}

	public List<Usuario> dameUsuarios() {
		List <Usuario> regreso = new LinkedList<Usuario>();
		Connection con  = ConnectDataBase.connectDataBase();
		Usuario nuevo = null;
		if(con != null) { 
			try {
				PreparedStatement ps = con.prepareStatement("SELECT usuario,password,nombre,correo,edad FROM USUARIOS");
				ResultSet result = ps.executeQuery();
				while(result.next()) {
					nuevo = new Usuario(result.getString("usuario"),result.getString("nombre"),result.getString("correo"),result.getString("password"),result.getInt("edad"));
					StringBuilder salida = new StringBuilder();
					salida.append(nuevo.getUsuario()).append("[").append(nuevo.getPassword()).append(",");
					salida.append(nuevo.getNombre()).append(",").append(nuevo.getCorreo()).append(",");
					salida.append(nuevo.getEdad()).append(",").append("]");
					System.out.println(salida);
					regreso.add(nuevo);
				}
			} catch (SQLException e) {
				regreso = null;
			}
		}else regreso = null;
		return regreso;
	}

	public boolean borraUsuario(String user) {
		boolean regreso = false;
		Connection con  = ConnectDataBase.connectDataBase();
		if(con != null) { 
			try {
				PreparedStatement ps = con.prepareStatement("DELETE FROM USUARIOS WHERE usuario=?");
				ps.setString(1,user);
				if(ps.executeUpdate() == 1) {
					regreso = true;
					System.out.println("Borré "+user);
				}
				else {
					regreso = false;
					System.out.println("No pude borrar "+user);
				}
			} catch (SQLException e) {
				regreso = false;
				System.out.println("Falló al borrar: "+user);
			}
		}else regreso = false;
		ConnectDataBase.closeConnection();
		return regreso;
	}
	
	

}
