package br.com.guilherme.garcia.comunicado.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.guilherme.garcia.comunicado.grpc.Comunicado;
import br.com.guilherme.garcia.comunicado.grpc.ComunicadoServiceGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcChannelFactory;

@Service
public class ComunicadoGRPC {

	@Autowired
	private GrpcChannelFactory grpcChannelFactory;

	private ComunicadoServiceGrpc.ComunicadoServiceBlockingStub comunicadoServiceBlockingStub;

	@PostConstruct
	public void init() {
		Channel channel = grpcChannelFactory.createChannel("crud-service");
		comunicadoServiceBlockingStub = ComunicadoServiceGrpc.newBlockingStub(channel);
	}

	public br.com.guilherme.garcia.comunicado.dto.Comunicado addComunicado(
			br.com.guilherme.garcia.comunicado.dto.Comunicado comunicado) {

		Comunicado comunicado2 = comunicadoServiceBlockingStub
				.addComunicado(Comunicado.newBuilder().setTexto(comunicado.getTexto()).build());

		comunicado.setId(Long.valueOf(comunicado2.getId()));
		comunicado.setTexto(comunicado2.getTexto());

		return comunicado;
	}

}
