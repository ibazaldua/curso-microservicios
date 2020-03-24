package com.thincode.ejemplo2.demorest01.conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ConectionBd {
	
	Connection connection;
	public Statement state;
	@Autowired
	public ConectionBd() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(  
	                 "jdbc:mariadb://localhost:3309/cursojava", "root", "");  
			System.out.println("Conecte BD");
	        //Statement statement = connection.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Statement create () {
		Statement statement = null;
		try {
			statement = this.connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}
	
	
	
	

}
