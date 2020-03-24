package com.thincode.ejercicio3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Control {

	static lecturaArchivo archivo;
	static ArrayList<String> lista;
	static ArrayList<Usuario> lUsuarios = new ArrayList<Usuario>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		archivo =  new lecturaArchivo("C:/Users/castillom/Documents/Eclipse/area-trabajo/prueba.txt");
		descargaArchivo();
		desglosa();
		despliegaLista();
	}
	
	public static void descargaArchivo() throws IOException {
		lista = archivo.leeArchivo();
		
	}
	
	public static void desglosa() {
		
	for (String l: lista) {	
		String cadena = l;
		String [] cadenas = cadena.split("[^(([0-9]{2}))[ ]+((([A-Z]{1}[a-z]+)[ ]){4}){1}([a-za-z0-9_]+(\\.[a-z0-9_]+)*@[a-z]+.[a-z]+[ ]){1}([0-9]{2}-[0-9]{2}-[0-9]{4}[ ]){1}([0-9]{2})]$");
	     
		 for(int i = 0; i<cadenas.length; i++){
	         System.out.println(cadenas[i]);
		 	}
		 
		 Pattern pat = Pattern.compile("^(([0-9]{2})[ ]+)((([A-Z]{1}[a-z]+)[ ])+){1}([a-za-z0-9_]+(\\.[a-z0-9_]+)*@[a-z]+.[a-z]+[ ]){1}([0-9]{2}-[0-9]{2}-[0-9]{4}[ ]){1}([0-9]{2})$");
		 
	     Matcher mat = pat.matcher(cadena);
	     
	     if (mat.matches()) {
	    	 System.out.println("Válido");
	    	 //System.out.println(mat.group(1));
	    	 System.out.println(mat.group(2));
	    	 System.out.println(mat.group(3));
	    	 //System.out.println(mat.group(4));
	    	 //System.out.println(mat.group(5));
	    	 System.out.println(mat.group(6));
	    	 //System.out.println(mat.group(7));
	    	 System.out.println(mat.group(8));
	    	 System.out.println(mat.group(9));
	    	 Usuario usu =  new Usuario(Integer.parseInt(mat.group(2)),mat.group(3),mat.group(6),mat.group(8),Integer.parseInt(mat.group(9)));
	    	 lUsuarios.add(usu);
	     	} else {
	         System.out.println("No Válido");
	     	}
		}
	}
	
	public static void despliegaLista() {
		
		for(Usuario u:lUsuarios) {
			System.out.println(u);
		}
	}
	

}
