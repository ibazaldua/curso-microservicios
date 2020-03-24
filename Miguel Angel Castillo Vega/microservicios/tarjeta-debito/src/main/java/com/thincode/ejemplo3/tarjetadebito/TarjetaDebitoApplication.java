package com.thincode.ejemplo3.tarjetadebito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TarjetaDebitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetaDebitoApplication.class, args);
	}

}
