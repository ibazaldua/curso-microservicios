package com.thincode.app.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mariadb.jdbc.Driver;

import com.thincode.app.web.threads.InsertaUsuarios;

/**
 * Servlet implementation class UsuarioServlet
 */

public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UsuarioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String url = "jdbc:mysql://localhost:3306/cursojava";
		try {
			DriverManager.registerDriver(new Driver());
			Connection con = DriverManager.getConnection(url, "root", "");
			PreparedStatement ps = con.prepareStatement("SELECT usuario,password,nombre,correo,edad,fechaAlta FROM USUARIOS");
			System.out.println("Conecta  base");
			ResultSet result = ps.executeQuery();
			out.println("TABLA USUARIOS:");
			while(result.next()) {
				StringBuilder salida = new StringBuilder();
				salida.append(result.getString("usuario")).append("[").append(result.getString("password")).append(",");
				salida.append(result.getString("nombre")).append(",").append(result.getString("correo")).append(",");
				salida.append(result.getInt("edad")).append(",").append(result.getDate("fechaAlta")).append("]");
				out.println(salida);
			}
		}catch (SQLException e) {
			if(e.getErrorCode() == 1049 ) {
				System.out.println("NO Conecte");
			}else {
				System.out.println(e.getErrorCode());
				e.printStackTrace();
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entro conexión");
		//PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		Integer age = Integer.parseInt(request.getParameter("age"));
		Integer repeticion = Integer.parseInt(request.getParameter("insertar"));
		InsertaUsuarios agrega = new InsertaUsuarios(user, name, password, email, age, repeticion);
		agrega.start();
		response.sendRedirect("./");
	}

}
