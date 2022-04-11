package com.bancoprueba.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancoprueba.prueba.entity.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long>{

}
