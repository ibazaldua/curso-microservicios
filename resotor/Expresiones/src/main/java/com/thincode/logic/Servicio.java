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
	private Usuario put;

	public Servicio() {
		selectorArchivos = new JFileChooser();
		selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		filtro = new FileNameExtensionFilter("Archivos txt", "txt");
		selectorArchivos.setFileFilter(filtro);
		usuarios = new HashMap<Integer, Usuario>();
//		usuarios.put(1, new Usuario(1,"René Soto",26,new Date(23071993),"resotor@outlook.com"));
//		usuarios.put(2, new Usuario(2,"Monserrat Zaragoza",24,new Date(8101993),"monserratzaragoza@outlook.com"));
//		usuarios.put(3, new Usuario(1,"Cuau Garza",26,new Date(25031993),"resotor@outlook.com"));
	}

	public boolean cargaArchivo() {
		Usuario u;
		boolean resultado = false;
		FileReader fileReader;
		BufferedReader buffer;
		String linea;
		StringBuffer salida;
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
		return new ArrayList(this.usuarios.values());
	}
}
