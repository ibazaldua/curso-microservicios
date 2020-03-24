package com.thincode.ejemplo3.estadocuenta.client;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.thincode.ejemplo3.estadocuenta.beans.Tarjeta;
@Component
public class FallBackCredito implements ProductoCreditoRest{

	@Override
	public String versionCredito() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ArrayList<Tarjeta>> consultaCredito(int cliente) {
		// TODO Auto-generated method stub
		System.out.println("Fallback");
		ArrayList<Tarjeta> lTar = new ArrayList<Tarjeta>();
		return new ResponseEntity<ArrayList<Tarjeta>>(lTar, HttpStatus.OK);
	}


	

}
