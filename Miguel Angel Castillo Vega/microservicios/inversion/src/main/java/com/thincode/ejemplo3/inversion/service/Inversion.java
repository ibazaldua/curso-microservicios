package com.thincode.ejemplo3.inversion.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.thincode.ejemplo3.inversion.beans.Tarjeta;



@Service

public class Inversion {
	private ArrayList<Tarjeta> inversion = new ArrayList<Tarjeta>();
	private ArrayList<Tarjeta> aTar;
	
	public Inversion() {
		
		Tarjeta tar = new Tarjeta(81868763,"Miguel Angel Castillo Vega",635258191,"Inversion Plazos",600200.00);
		inversion.add(tar);
		tar = new Tarjeta(1203142745,"Maria del Carmen Gomez Gonzalez",736235123,"Inversion Fija",42656.00);
		inversion.add(tar);
		tar = new Tarjeta(173265522,"Cesar Santiago Hernandez",364517381,"Inversion Fija",2754.00);
		inversion.add(tar);
		tar = new Tarjeta(236456811,"Gabriela Hernandez Ramirez",765421341,"Inversion Plazos",45291.00);
		inversion.add(tar);
		
	}
	
	public ArrayList<Tarjeta> consultaCliente(int noCliente){
		aTar = new ArrayList<Tarjeta>();
		
		for (Tarjeta t: inversion) {
			if (t.getNocliente() == noCliente) {
				aTar.add(t);
			}
		}
		
		return aTar;
	}

}
