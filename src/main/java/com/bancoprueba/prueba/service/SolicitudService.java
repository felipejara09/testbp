package com.bancoprueba.prueba.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bancoprueba.prueba.entity.Solicitud;



@Component
public interface SolicitudService {
	
	Solicitud crearSolicitud(Solicitud usuario);
	List<Solicitud> consultarSolicitud();

}
