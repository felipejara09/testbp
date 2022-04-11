package com.bancoprueba.prueba.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoprueba.prueba.entity.Solicitud;
import com.bancoprueba.prueba.service.SolicitudService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Solicitud")
public class SolicitudCrontroller {
	
	@Autowired
	SolicitudService service;
	
	@PostMapping("/Crear")
	public ResponseEntity<?> crear(@RequestBody Solicitud usuario){
		Solicitud usuario1 = new Solicitud(); 
		Map<String, Object> response = new HashMap<>();
		try {
			usuario1 = service.crearSolicitud(usuario);
		}catch(Exception e) {
			response.put("error", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("usuario", usuario);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/ConsultarSolicitud")
	public ResponseEntity<?> consultarSolicitud() {
		List<Solicitud> obj = null;
		Map<String, Object> response = new HashMap<>();
		try {
			obj = service.consultarSolicitud();
		} catch (Exception e) {
			response.put("mensaje", "Error al consultar las percepcion");
			response.put("error", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Se realizo la consulta correctamente");
		response.put("Consulta", obj);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	
	}
}
