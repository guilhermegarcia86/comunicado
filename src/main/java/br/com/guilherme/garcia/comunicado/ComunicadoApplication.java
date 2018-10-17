package br.com.guilherme.garcia.comunicado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import br.com.guilherme.garcia.comunicado.client.ComunicadoClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = ComunicadoClient.class)
@ComponentScan(basePackageClasses = ComunicadoClient.class)
public class ComunicadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComunicadoApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
