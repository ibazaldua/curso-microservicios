package com.thincode.ejemplo3.tarjetacredito.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.thincode.ejemplo3.tarjetacredito.beans.Tarjeta;




@Service
public class TarjetaCredito {
	private ArrayList<Tarjeta> tarCredito = new ArrayList<Tarjeta>();
	private ArrayList<Tarjeta> aTar;
	
	public TarjetaCredito() {
		
		Tarjeta tar = new Tarjeta(81868763,"Miguel Angel Castillo Vega",376646272,"Tarjeta Oro",35700.00);
		tarCredito.add(tar);
		tar = new Tarjeta(81868763,"Miguel Angel Castillo Vega",614427191,"Tarjeta Azul",12300.00);
		tarCredito.add(tar);
		tar = new Tarjeta(1203142745,"Maria del Carmen Gomez Gonzalez",721542387,"Tarjeta Clasica",1500.00);
		tarCredito.add(tar);
		tar = new Tarjeta(173265522,"Cesar Santiago Hernandez",33421111,"Tarjeta Platino",50300.00);
		tarCredito.add(tar);
		tar = new Tarjeta(173265522,"Cesar Santiago Hernandez",72538291,"Tarjeta Oro",35100.00);
		tarCredito.add(tar);
		tar = new Tarjeta(236456811,"Gabriela Hernandez Ramirez",87352511,"Tarjeta Smart",15000.00);
		tarCredito.add(tar);
		
	}
	
	public ArrayList<Tarjeta> consultaCliente(int noCliente){
		aTar = new ArrayList<Tarjeta>();
		
		for (Tarjeta t: tarCredito) {
			if (t.getNocliente() == noCliente) {
				aTar.add(t);
			}
		}
		
		return aTar;
	}

}
