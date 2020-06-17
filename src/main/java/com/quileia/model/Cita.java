package com.quileia.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



public class Cita {

	private Integer registro;

	@NotNull(message = "campo requerido")

	private String paciente;

	@NotNull(message = "campo requerido")

	private String medico;

	@NotNull(message = "campo requerido")
	@Min(value = 6, message = "ingrese horario mayor a las 5 horas")
	@Max(value = 18, message = "ingrese horario menor a las  19 horas")
	private String horarioCita;

	public Cita() {
	}

	public Cita(Integer registro, String paciente, String medico, String horarioCita) {

		this.registro = registro;
		this.paciente = paciente;
		this.medico = medico;
		this.horarioCita = horarioCita;

	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getHorarioCita() {
		return horarioCita;
	}

	public void setHorarioCita(String horarioCita) {
		this.horarioCita = horarioCita;
	}

	public Integer getRegistro() {
		return registro;
	}

	public void setRegistro(Integer registro) {
		this.registro = registro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horarioCita == null) ? 0 : horarioCita.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result + ((registro == null) ? 0 : registro.hashCode());
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
		Cita other = (Cita) obj;
		if (!horarioCita.equals(other.horarioCita)) {
			return false;
		}
		if (!medico.equals(other.medico)) {
			return false;
		}
		if (!paciente.equals(other.paciente)) {
			return false;
		}
		if (registro == null) {
			if (other.registro != null) {
				return false;
			}
		} else if (!registro.equals(other.registro)) {
			return false;
		}
		return true;
	}

}
