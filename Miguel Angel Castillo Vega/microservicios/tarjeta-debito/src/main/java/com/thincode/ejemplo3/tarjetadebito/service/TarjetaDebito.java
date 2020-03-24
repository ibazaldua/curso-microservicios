package com.thincode.ejemplo3.tarjetadebito.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.thincode.ejemplo3.tarjetadebito.beans.Tarjeta;



@Service
public class TarjetaDebito {
	private ArrayList<Tarjeta> tarDebito = new ArrayList<Tarjeta>();
	private ArrayList<Tarjeta> aTar;
	
	public TarjetaDebito() {
		System.out.println("inicio debito");
		Tarjeta tar = new Tarjeta(81868763,"Miguel Angel Castillo Vega",92736352,"Tarjeta Debito",19500.00);
		tarDebito.add(tar);
		tar = new Tarjeta(1203142745,"Maria del Carmen Gomez Gonzalez",1865345268,"Tarjeta Debito",13543.00);
		tarDebito.add(tar);
		tar = new Tarjeta(173265522,"Cesar Santiago Hernandez",725418990,"Tarjeta Debito",9344.00);
		tarDebito.add(tar);
		tar = new Tarjeta(236456811,"Gabriela Hernandez Ramirez",981635112,"Tarjeta Debito",11865.00);
		tarDebito.add(tar);
		
	}
	
	public ArrayList<Tarjeta> consultaCliente(int noCliente){
		aTar = new ArrayList<Tarjeta>();
		
		for (Tarjeta t: tarDebito) {
			if (t.getNocliente() == noCliente) {
				aTar.add(t);
			}
		}
		
		return aTar;
	}

}
