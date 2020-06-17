package com.quileia.model;

import javax.validation.constraints.*;

public class Modelo {

	@NotNull(message = "campo requerido")
	@Size(min = 2, max = 40, message = " rango valido: 2 a 40 caracteres")
	protected String nombre;

	@NotNull(message = "campo requerido")
	@Size(min = 2, max = 40, message = "rango valido: 2 a 40 caracteres")
	protected String identificacion;

	@NotNull(message = "campo requerido")
	@Size(min = 2, max = 20, message = "rango valido: 2 a 20 caracteres")
	protected String tipoIdentificacion;

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombreMedico) {
		this.nombre = nombreMedico;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipoIdentificacion == null) ? 0 : tipoIdentificacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Modelo other = (Modelo) obj;
		if (identificacion == null) {
			if (other.identificacion != null) {
				return false;
			}
		} else if (!identificacion.equals(other.identificacion)) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (tipoIdentificacion == null) {
			if (other.tipoIdentificacion != null) {
				return false;
			}
		} else if (!tipoIdentificacion.equals(other.tipoIdentificacion)) {
			return false;
		}
		return true;
	}
	
	

}
