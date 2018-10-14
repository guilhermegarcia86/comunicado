package br.com.guilherme.garcia.comunicado.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.garcia.comunicado.dto.Comunicado;

@RestController
public class ComunicadoController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	private ComunicadoClient comunicadoClient;
	
//	@GetMapping("/feign/all")
//	public List<Comunicado> getAll(){
//		return comunicadoClient.getAllComunicados();
//	}
	
	@PostMapping("file")
	public Comunicado info(@RequestBody Comunicado comunicado) {
		return comunicado;
	}

}
