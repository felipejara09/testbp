package com.bancoprueba.prueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bancoprueba.prueba.entity.Solicitud;
import com.bancoprueba.prueba.repository.SolicitudRepository;


@Service
@Component

public class SolicitudServiceImpl implements SolicitudService {
	
	@Autowired
	SolicitudRepository repository;
	
	@Override
	public Solicitud crearSolicitud(Solicitud usuario) {
		
		return repository.save(usuario);
	}
	
	@Override
	public List<Solicitud> consultarSolicitud() {
		List<Solicitud> obj = new ArrayList<>();
		obj = repository.findAll();
		return obj;
	}

}
