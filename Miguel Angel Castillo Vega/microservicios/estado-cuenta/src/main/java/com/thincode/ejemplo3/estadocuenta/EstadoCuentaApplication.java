package com.thincode.ejemplo3.estadocuenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker	
@EnableHystrix
public class EstadoCuentaApplication {
	
	/*private RestTemplate restTemplate;
	
	@Autowired
	public EstadoCuentaApplication(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(EstadoCuentaApplication.class, args);
	}
	

}
