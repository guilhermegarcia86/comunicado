package br.com.guilherme.garcia.comunicado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.garcia.comunicado.dto.Comunicado;
import br.com.guilherme.garcia.comunicado.service.ComunicadoService;

@RestController
public class ComunicadoController {
	
	@Autowired
	private ComunicadoService comunicadoService;
	
	@PostMapping("add")
	public ResponseEntity<Comunicado> add(@RequestBody Comunicado comunicado) {
		return ResponseEntity.ok(comunicadoService.add(comunicado));
	}

}
