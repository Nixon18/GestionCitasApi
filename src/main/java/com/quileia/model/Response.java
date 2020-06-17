package com.quileia.model;

import org.springframework.stereotype.Component;

@Component
public class Response {
	
	private String estado;
	private String message;
	private Cita cita;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Cita getCita() {
		return cita;
	}
	public void setCita(Cita cita) {
		this.cita = cita;
	}
	
	

}
