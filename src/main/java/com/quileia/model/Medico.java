package com.quileia.model;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Medico extends Modelo {

	@NotNull(message = "campo requerido")
	@Size(min = 1, max = 40, message = " rango valido: 1 a 40 caracteres")
	private String apellido;

	@NotNull(message = "campo requerido")
	@Size(min = 1, max = 20, message = "rango valido: 1 a 20 caracteres")
	private String numeroTarjetaProfesional;

	@NotNull(message = "campo requerido")
	@Min(value = 1, message = "ingrese experiencias mayore a 1 año")
	@Max(value = 70, message = "ingrese experiencias menores a 71 año")
	private Float tiempoExperiencia;

	@NotNull(message = "campo requerido")
	@Size(min = 1, max = 40, message = " rango valido: 1 a 40 caracteres")
	private String especialidad;

	@NotNull(message = "campo requerido")
	@Min(value = 6, message = "ingrese horario mayor a las 5 horas")
	@Max(value = 19, message = "ingrese horario menor a las  20 horas")
	private String inicioAtencion;

	@NotNull(message = "campo requerido")
	@Min(value = 6, message = "ingrese horario mayor a las 5 horas")
	@Max(value = 19, message = "ingrese horario menor a las  20 horas")
	private String finAtencion;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroTarjetaProfesional() {
		return numeroTarjetaProfesional;
	}

	public void setNumeroTarjetaProfesional(String numeroTarjetaProfesional) {
		this.numeroTarjetaProfesional = numeroTarjetaProfesional;
	}

	public Float getTiempoExperiencia() {
		return tiempoExperiencia;
	}

	public void setTiempoExperiencia(Float tiempoExperiencia) {
		this.tiempoExperiencia = tiempoExperiencia;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getInicioAtencion() {
		return inicioAtencion;
	}

	public void setInicioAtencion(String inicioAtencion) {
		this.inicioAtencion = inicioAtencion;
	}

	public String getFinAtencion() {
		return finAtencion;
	}

	public void setFinAtencion(String finAtencion) {
		this.finAtencion = finAtencion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + ((finAtencion == null) ? 0 : finAtencion.hashCode());
		result = prime * result + ((inicioAtencion == null) ? 0 : inicioAtencion.hashCode());
		result = prime * result + ((numeroTarjetaProfesional == null) ? 0 : numeroTarjetaProfesional.hashCode());
		result = prime * result + ((tiempoExperiencia == null) ? 0 : tiempoExperiencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if ((this == obj) && (super.equals(obj))) {
			return true;
		}

		if (obj != null) {
			Medico other = (Medico) obj;

			if ((!apellido.equals(other.apellido)) || (!especialidad.equals(other.especialidad))) {
				return false;
			}

			if ((!finAtencion.equals(other.finAtencion)) || (!inicioAtencion.equals(other.inicioAtencion))) {
				return false;
			}

			if ((!numeroTarjetaProfesional.equals(other.numeroTarjetaProfesional))
					|| (!tiempoExperiencia.equals(other.tiempoExperiencia))) {
				return false;

			}

		} else {
			return false;

		}

		return true;

	}

}
