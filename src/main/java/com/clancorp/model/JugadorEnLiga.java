package com.clancorp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "jugador_en_liga")
public class JugadorEnLiga implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -567279075422769081L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
		
	private Integer ganadas;
	
	private Integer perdidas;
	
	private Integer puntos;
	
	@ManyToOne
	@JoinColumn(name = "liga")
	private Liga liga;
	
	@Column(name = "is_suspendido")
	private Boolean isSuspendido;
	
	@OneToOne
	private Jugador jugador;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGanadas() {
		return ganadas;
	}

	public void setGanadas(Integer ganadas) {
		this.ganadas = ganadas;
	}

	public Integer getPerdidas() {
		return perdidas;
	}

	public void setPerdidas(Integer perdidas) {
		this.perdidas = perdidas;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Boolean getIsSuspendido() {
		return isSuspendido;
	}

	public void setIsSuspendido(Boolean isSuspendido) {
		this.isSuspendido = isSuspendido;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}
}
