package br.com.guilherme.garcia.comunicado.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import br.com.guilherme.garcia.comunicado.dto.Comunicado;

@FeignClient(name="crud-service")
public interface ComunicadoClient {
	
	@GetMapping("/comunicado/all")
	public List<Comunicado> getAllComunicados();
	
	@GetMapping("/comunicado/{id}")
	public Comunicado getComunicado();
	
	@PostMapping("/comunicado/add")
	public Comunicado addComunicado(Comunicado counicado);
	
	@DeleteMapping("/comunicado/{id}")
	public void deleteComunicado();
	
	@PutMapping("/comnicado/{id}")
	public Comunicado update();

}
