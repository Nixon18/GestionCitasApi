package com.quileia.entity;

import javax.persistence.*;

@Entity
@Table(name = "pacientes")

public class EntidadPaciente {

	@Column(name = "Nombre_Completo")
	private String nombreEntidad;

	@Column(name = "Fecha_Nacimiento")
	private String fechaNacimientoEntidad;

	@Id
	@Column(name = "Identificacion")
	private String identificacionEntidad;

	@Column(name = "Tipo_Identificacion")
	private String tipoIdentificacionEntidad;

	@Column(name = "Eps")
	private String epsEntidad;

	@Column(name = "Historia_Clinica")
	private String historiaClinicaEntidad;

	public EntidadPaciente() {
	}

	public EntidadPaciente(String nombre, String fechaNacimiento, String identificacion, String tipoIdentificacion,
			String eps, String historiaClinica) {

		this.nombreEntidad = nombre;
		this.fechaNacimientoEntidad = fechaNacimiento;
		this.identificacionEntidad = identificacion;
		this.tipoIdentificacionEntidad = tipoIdentificacion;
		this.epsEntidad = eps;
		this.historiaClinicaEntidad = historiaClinica;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getFechaNacimientoEntidad() {
		return fechaNacimientoEntidad;
	}

	public void setFechaNacimientoEntidad(String fechaNacimientoEntidad) {
		this.fechaNacimientoEntidad = fechaNacimientoEntidad;
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

	public String getEpsEntidad() {
		return epsEntidad;
	}

	public void setEpsEntidad(String epsEntidad) {
		this.epsEntidad = epsEntidad;
	}

	public String getHistoriaClinicaEntidad() {
		return historiaClinicaEntidad;
	}

	public void setHistoriaClinicaEntidad(String historiaClinicaEntidad) {
		this.historiaClinicaEntidad = historiaClinicaEntidad;
	}

}
