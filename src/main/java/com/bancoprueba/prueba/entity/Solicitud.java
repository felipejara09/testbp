package com.bancoprueba.prueba.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "T01_SOLICITUD")

public class Solicitud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@SequenceGenerator(name="ssfin_admin.tbl_usuario_usua_usua_seq", sequenceName="ssfin_admin.tbl_usuario_usua_usua_seq", allocationSize=1)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "ESTADO")
	private Integer estado ;
	@Column(name = "FECHA_INGRESO")
	private Date fecha_ingreso;
	@Column(name = "MONTO")
	private BigDecimal monto;
	@Column(name = "ID_CLIENTE")
	private String id_cliente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
	

}
