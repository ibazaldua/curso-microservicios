package com.thincode.estadocuenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class EstadoCuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstadoCuentaApplication.class, args);
		System.out.println("Estado de cuenta resotor - Corriendo");
	}
	
	

}
