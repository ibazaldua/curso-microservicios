package com.thincode.estadocuenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class EstadoCuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstadoCuentaApplication.class, args);
		System.out.println("Estado de cuenta resotor - Corriendo");
	}
	
	

}
