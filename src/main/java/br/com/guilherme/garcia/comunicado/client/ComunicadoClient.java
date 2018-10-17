package br.com.guilherme.garcia.comunicado.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.guilherme.garcia.comunicado.dto.Comunicado;

@FeignClient(name="crud-service-mysql")
public interface ComunicadoClient {
	
	@GetMapping("/comunicado/all")
	public List<Comunicado> getAllComunicados();

}
