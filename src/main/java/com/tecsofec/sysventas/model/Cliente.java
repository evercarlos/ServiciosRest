package com.tecsofec.sysventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
	
	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "CLIENTE_ID_GENERATOR",sequenceName = "cliente_id_seq",allocationSize = 1)//allocationSize = 1
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE_ID_GENERATOR")
	private Integer id;
	
	private String nombres; 
	private String direccion;
	private String telefono;
	
	@Column(name = "datos_contacto")
	private String datosContacto; 
	
	private boolean estado;
	

}
