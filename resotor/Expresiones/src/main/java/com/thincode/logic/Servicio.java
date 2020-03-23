package com.thincode.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.thincode.objects.Usuario;

public class Servicio {

	JFileChooser selectorArchivos;
	FileNameExtensionFilter filtro;
	File archivo;
	Map<Integer, Usuario> usuarios;


	public Servicio() {
		selectorArchivos = new JFileChooser();
		selectorArchivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filtro = new FileNameExtensionFilter("Archivos txt", "txt");
		selectorArchivos.setFileFilter(filtro);
		usuarios = new HashMap<Integer, Usuario>();
	}

	public boolean cargaArchivo() {
		Usuario u;
		boolean resultado = false;
		FileReader fileReader;
		BufferedReader buffer;
		String linea;
		String expresion = "(^[\\d]+)\\s*([[a-zA-z]+\\s]{3,})\\s*(\\d+)\\s*(\\d+.\\d+.\\d+)\\s*";
		String correo = "([\\w\\-]+[\\.[\\w\\-]+]*\\@[A-Za-z0-9]+[\\.[A-Za-z0-9]+]*.[A-Za-z]{2,})";
		try {
			Integer archResult = selectorArchivos.showOpenDialog(selectorArchivos);
			if (archResult.equals(JFileChooser.APPROVE_OPTION)) {
				archivo = selectorArchivos.getSelectedFile();
				fileReader = new FileReader(archivo);
				buffer = new BufferedReader(fileReader);
				while ((linea = buffer.readLine()) != null) {
					Pattern patron = Pattern.compile(expresion + correo);
					Matcher compara = patron.matcher(linea);
					if (compara.find()) {
						u = new Usuario(Integer.parseInt(compara.group(1)),compara.group(2),Integer.parseInt(compara.group(3)),compara.group(4),compara.group(5));
						usuarios.put(u.getId(), u);
						System.out.println("Agrego: " + u);
					} else {
						System.out.println("No se encontro coincidencia");
					}
				}
			}
			if ((archivo == null) || (archivo.getName().equals(""))) {
				System.out.println("Nombre de archivo inválido");
			} else {
				resultado = true;
			}
		} catch (Exception e) {
			System.out.println("Falló carga de archivo " + e);
			e.printStackTrace();
		} finally {

		}
		return resultado;
	}

	public Usuario buscaId(int id) {
		return usuarios.get(id);
	}

	public List<Usuario> consultaUsuarios() {
		return new ArrayList<Usuario>(this.usuarios.values());
	}
}
