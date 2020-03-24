package com.thincode.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class lecturaArchivo {
	
	FileReader archivo;
	BufferedReader buffer;
	public lecturaArchivo(String nombreFile) throws IOException {
			
			archivo = new FileReader(nombreFile);
			buffer = new BufferedReader(archivo);

			
	}
	
	public ArrayList<String> leeArchivo() throws IOException{
		ArrayList<String> lista = new ArrayList<String>();
		String cadena;
		while((cadena = buffer.readLine()) != null) {
			lista.add(cadena);
			}
		return lista;
	}
	
	public void cierraArchivo() throws IOException {
		
		archivo.close();
	}

}
