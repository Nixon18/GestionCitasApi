package com.quileia.entity;

import javax.persistence.*;

@Entity
@Table(name = "citas")

public class EntidadCita {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Registro")
	private Integer registroEntidad;

	@Column(name = "Paciente")
	private String pacienteEntidad;

	@Column(name = "Medico")
	private String medicoEntidad;

	@Column(name = "Horario_Cita")
	private String horarioCitaEntidad;

	public String getPacienteEntidad() {
		return pacienteEntidad;
	}

	public void setPacienteEntidad(String pacienteEntidad) {
		this.pacienteEntidad = pacienteEntidad;
	}

	public String getMedicoEntidad() {
		return medicoEntidad;
	}

	public void setMedicoEntidad(String medicoEntidad) {
		this.medicoEntidad = medicoEntidad;
	}

	public String getHorarioCitaEntidad() {
		return horarioCitaEntidad;
	}

	public void setHorarioCitaEntidad(String horarioCitaEntidad) {
		this.horarioCitaEntidad = horarioCitaEntidad;
	}

	public Integer getRegistroEntidad() {
		return registroEntidad;
	}

	public void setRegistroEntidad(Integer registroEntidad) {
		this.registroEntidad = registroEntidad;
	}

}
