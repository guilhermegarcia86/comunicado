package br.com.guilherme.garcia.comunicado.controlle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.garcia.comunicado.client.ComunicadoClient;
import br.com.guilherme.garcia.comunicado.dto.Comunicado;

@RestController
public class ComunicadoController {
	
	@Autowired
	private ComunicadoClient comunicadoClient;
	
	@GetMapping("/all")
	public List<Comunicado> getAll(){
		return comunicadoClient.getAllComunicados();
	}

}
