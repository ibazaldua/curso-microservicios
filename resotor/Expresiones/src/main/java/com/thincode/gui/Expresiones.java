package com.thincode.gui;

import java.util.List;
import java.util.Scanner;

import com.thincode.logic.Servicio;
import com.thincode.objects.Usuario;

public class Expresiones {
	private Scanner scan;
	private Servicio servicio;

	public Expresiones() {
		scan = new Scanner(System.in);
		servicio = new Servicio();
		gui();
	}

	public static void main(String args[]) {
		new Expresiones();
	}

	public void gui() {
		int opc;
		boolean tengoArchivo = false;
		Usuario usuario;
		List<Usuario> usuarios;
		do {
			System.out.println("Bienvenido al menú");
			System.out.println("1. Agregar archivo");
			System.out.println("2. Consultar por Id");
			System.out.println("3. Consultar todos");
			System.out.println("4. Salir");
			try {
				opc = scan.nextInt();
			}catch(Exception e) {
				opc = 0;
				scan.nextLine();
			}
			switch (opc) {
			case 1:
				tengoArchivo = servicio.cargaArchivo();
				if (tengoArchivo) {
					System.out.println("Archivo cargado exitosamente");
				}
				break;
			case 2:
				if (tengoArchivo) {
					System.out.println("Ingresa el ID a buscar:");
					usuario = servicio.buscaId(scan.nextInt());
					if (usuario != null) {
						System.out.println("Usuario encontrado:");
						System.out.println(usuario);
					}
				}else System.out.println("Tienes que cargar primero un archivo");
				break;
			case 3:
				if (tengoArchivo) {
					System.out.println("Usuarios contenidos:");
					usuarios = servicio.consultaUsuarios();
					for (Usuario user : usuarios)
						System.out.println(user);
				}else System.out.println("Tienes que cargar primero un archivo");
				break;
			case 4:
				System.out.println("Hasta luego!!!");
				break;

			default:
				System.out.println("Opción invalida!!");
			}
		} while (opc != 4);

	}
}
