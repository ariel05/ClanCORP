package com.clancorp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jugador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -988553499627352413L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nombre;
	
	@Column(name = "url_aoe")
	private String urlAoe;
	
	private String nick;
	
	private Boolean compromiso;
	
	@Column(name = "numero_de_telefono")
	private String numeroTelefono;
	
	private CodigoPaisEnum pais;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrlAoe() {
		return urlAoe;
	}

	public void setUrlAoe(String urlAoe) {
		this.urlAoe = urlAoe;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Boolean getCompromiso() {
		return compromiso;
	}

	public void setCompromiso(Boolean compromiso) {
		this.compromiso = compromiso;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public CodigoPaisEnum getPais() {
		return pais;
	}

	public void setPais(CodigoPaisEnum pais) {
		this.pais = pais;
	}
}
