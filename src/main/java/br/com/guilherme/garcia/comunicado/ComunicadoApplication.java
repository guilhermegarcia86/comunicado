package br.com.guilherme.garcia.comunicado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("br.com.guilherme.garcia.comunicado")
@EnableDiscoveryClient
public class ComunicadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComunicadoApplication.class, args);
	}
}