package com.quileia.model;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Paciente extends Modelo {

	@NotNull(message = "campo requerido")

	private String fechaNacimiento;

	@NotNull(message = "campo requerido")
	@Size(min = 2, max = 20, message = "rango valido: 2 a 20 caracteres")

	private String eps;

	@NotNull(message = "campo requerido")
	@Size(min = 10, max = 100, message = "rango valido: 10 a 100 caracteres")

	private String historiaClinica;

	public Paciente() {
	}

	public Paciente(String nombre, String fechaNacimiento, String identificacion, String tipoIdentificacion, String eps,
			String historiaClinica) {

		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.identificacion = identificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.eps = eps;
		this.historiaClinica = historiaClinica;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(String historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((eps == null) ? 0 : eps.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((historiaClinica == null) ? 0 : historiaClinica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if ((this == obj) && (super.equals(obj))) {
			return true;
		}
		if (obj != null) {
			Paciente other = (Paciente) obj;
			if (!eps.equals(other.eps)) {
				return false;
			}
			if (!fechaNacimiento.equals(other.fechaNacimiento)) {
				return false;
			}
			if (!historiaClinica.equals(other.historiaClinica)) {
				return false;
			}

		} else {
			return false;
		}

		return true;
	}

}
