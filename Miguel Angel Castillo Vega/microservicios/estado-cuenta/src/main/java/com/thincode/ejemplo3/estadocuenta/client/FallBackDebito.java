package com.thincode.ejemplo3.estadocuenta.client;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;
@Component
public class FallBackDebito implements ProductoDebitoRest{

	@Override
	public String versiondebito() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ArrayList<Tarjeta>> consultaDebito(int cliente){
		// TODO Auto-generated method stub
		System.out.println("Fallback");
		ArrayList<Tarjeta> lTar = new ArrayList<Tarjeta>();
		return new ResponseEntity<ArrayList<Tarjeta>>(lTar, HttpStatus.OK);
	}


	

}
