package com.thincode.app.web.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.mariadb.jdbc.Driver;

public class InsertaUsuarios extends Thread{
	
	String user;
	String name;
	String password;
	String email;
	Integer age; 
	Integer repeticion;
	private String newUser;
	static String url = "jdbc:mysql://localhost:3306/cursojava";
	
	public InsertaUsuarios(String user, String name, String password, String email, Integer age, Integer repeticion) {
		super();
		this.user = user;
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.repeticion = repeticion;
	}


	public void run() {
		inserta();
	}
	
	public void inserta() {
		int i;
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection con = DriverManager.getConnection(url, "root", "");
			System.out.println("Conecte");
			for(i=0;i<repeticion;i++) {
				PreparedStatement ps = con.prepareStatement("INSERT INTO Usuarios(usuario,password,nombre,correo,edad) VALUES(?,?,?,?,?)");
				newUser = user + i;
				ps.setString(1,newUser);
				ps.setString(2,password);
				ps.setString(3,name);
				ps.setString(4,email);
				ps.setInt(5, age);
				StringBuilder log = new StringBuilder();
				log.append("Se agregó: [").append(newUser).append(",");
				log.append(password).append(",").append(name).append(",");
				log.append(email).append(",").append(age).append("]");
				if(ps.executeUpdate() == 1) {
					System.out.println(log);
				}
				else 	System.out.println("No se insertó");
			}
		} catch (SQLException e) {
			if(e.getErrorCode() == 0 ) {
				System.out.println("NO Conecte");
			}else if(e.getErrorCode() == 1062){
				System.out.println("USUARIO DUPLICADO");
			}else {
				System.out.println(e.getErrorCode());
				e.printStackTrace();
			}
			
		}
	}
	
	

}
