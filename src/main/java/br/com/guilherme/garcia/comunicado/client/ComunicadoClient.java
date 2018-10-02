package br.com.guilherme.garcia.comunicado.client;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.guilherme.garcia.comunicado.dto.Comunicado;

@FeignClient(name="zuul-api-gateway-server")
@RibbonClient(name="crud-service")
public interface ComunicadoClient {
	
	@GetMapping("/crud-service/comunicado/all")
	public List<Comunicado> getAllComunicados();

}
