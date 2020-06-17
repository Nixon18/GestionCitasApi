package com.quileia.entity;

import javax.persistence.*;

@Entity
@Table(name = "medicos")

public class EntidadMedico {

	@Column(name = "Nombre_Completo")
	private String nombreEntidad;

	@Column(name = "apellidos")
	private String apellidoEntidad;

	@Id
	@Column(name = "Identificacion")
	private String identificacionEntidad;

	@Column(name = "Tipo_Identificacion")
	private String tipoIdentificacionEntidad;

	@Column(name = "Numero_Tarjeta_Profesional")
	private String numeroTarjetaProfesionalEntidad;

	@Column(name = "Tiempo_Experiencia")
	private Float tiempoExperienciaEntidad;

	@Column(name = "Especialidad")
	private String especialidadEntidad;

	@Column(name = "Hora_Inicio_Atencion")
	private String inicioAtencionEntidad;

	@Column(name = "Hora_Fin_Atencion")
	private String finAtencionEntidad;

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getApellidoEntidad() {
		return apellidoEntidad;
	}

	public void setApellidoEntidad(String apellidoEntidad) {
		this.apellidoEntidad = apellidoEntidad;
	}

	public String getIdentificacionEntidad() {
		return identificacionEntidad;
	}

	public void setIdentificacionEntidad(String identificacionEntidad) {
		this.identificacionEntidad = identificacionEntidad;
	}

	public String getTipoIdentificacionEntidad() {
		return tipoIdentificacionEntidad;
	}

	public void setTipoIdentificacionEntidad(String tipoIdentificacionEntidad) {
		this.tipoIdentificacionEntidad = tipoIdentificacionEntidad;
	}

	public String getNumeroTarjetaProfesionalEntidad() {
		return numeroTarjetaProfesionalEntidad;
	}

	public void setNumeroTarjetaProfesionalEntidad(String numeroTarjetaProfesionalEntidad) {
		this.numeroTarjetaProfesionalEntidad = numeroTarjetaProfesionalEntidad;
	}

	public Float getTiempoExperienciaEntidad() {
		return tiempoExperienciaEntidad;
	}

	public void setTiempoExperienciaEntidad(Float tiempoExperienciaEntidad) {
		this.tiempoExperienciaEntidad = tiempoExperienciaEntidad;
	}

	public String getEspecialidadEntidad() {
		return especialidadEntidad;
	}

	public void setEspecialidadEntidad(String especialidadEntidad) {
		this.especialidadEntidad = especialidadEntidad;
	}

	public String getInicioAtencionEntidad() {
		return inicioAtencionEntidad;
	}

	public void setInicioAtencionEntidad(String inicioAtencionEntidad) {
		this.inicioAtencionEntidad = inicioAtencionEntidad;
	}

	public String getFinAtencionEntidad() {
		return finAtencionEntidad;
	}

	public void setFinAtencionEntidad(String finAtencionEntidad) {
		this.finAtencionEntidad = finAtencionEntidad;
	}

}
