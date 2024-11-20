package com.example.demo.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "numero_bus")
	private String numeroBus;
	@Column
	private String placa;

	@Column(name="fecha_creacion",nullable = false, updatable = false)
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime createdDate = LocalDateTime.now();
	@Column
	private String caracteristicas;
	
	@ManyToOne
	@JoinColumn(name = "marca_id")
	private Marca marca;
	@Column
	private String estado;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(Long id, String numeroBus, String placa, LocalDateTime createdDate, String caracteristicas,
			Marca marca, String estado) {
		super();
		this.id = id;
		this.numeroBus = numeroBus;
		this.placa = placa;
		this.createdDate = createdDate;
		this.caracteristicas = caracteristicas;
		this.marca = marca;
		this.estado = estado;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroBus() {
		return numeroBus;
	}

	public void setNumeroBus(String numeroBus) {
		this.numeroBus = numeroBus;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
