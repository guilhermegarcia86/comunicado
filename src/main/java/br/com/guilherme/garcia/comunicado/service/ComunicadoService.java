package br.com.guilherme.garcia.comunicado.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guilherme.garcia.comunicado.client.ComunicadoClient;
import br.com.guilherme.garcia.comunicado.dto.Comunicado;

@Service
public class ComunicadoService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ComunicadoClient comunicadoClient;
	
	public Comunicado add(Comunicado comunicado) {
		return comunicadoClient.addComunicado(comunicado);
	}

}
