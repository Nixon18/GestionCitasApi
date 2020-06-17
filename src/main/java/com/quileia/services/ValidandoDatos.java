package com.quileia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quileia.model.*;

@Service
public class ValidandoDatos {

	@Autowired
	MedicoService medicoService;

	@Autowired
	PacienteService pacienteService;

	@Autowired
	CitaService citaService;

	@Autowired
	Response responseCita;

	private Cita disponibilidadPaciente;
	private Cita disponibilidadMedico;
	private int horaInicial;
	private int horaFinal;
	private int horarioCita;
	private boolean outRangoCita;

	public Response validarRegistro(Cita citaInsertar) {

		if (pacienteService.obtenerPorId(citaInsertar.getPaciente()) == null
				|| medicoService.obtenerPorId(citaInsertar.getMedico()) == null) {

			responseCita.setMessage("el paciente o medico asignado no existe");
			responseCita.setEstado("01");
			return responseCita;

		}

		else {

			obtenerDatosCita(citaInsertar);

			if (outRangoCita) {

				responseCita.setMessage("valide el horario del medico asignado");
				responseCita.setEstado("02");
				return responseCita;

			} else {

				if ((disponibilidadPaciente != null) || (disponibilidadMedico != null)) {

					responseCita.setMessage("la hora solicitada ya esta agendada con este medico o paciente");
					responseCita.setEstado("03");
					return responseCita;

				} else {

					responseCita.setEstado("aceptado");
					responseCita.setCita(citaService.crear(citaInsertar));
					return responseCita;

				}

			}

		}

	}

	public boolean obtenerDatosCita(Cita citaInsertar) {

		horaInicial = Integer.parseInt(medicoService.obtenerPorId(citaInsertar.getMedico()).getInicioAtencion());
		horaFinal = Integer.parseInt(medicoService.obtenerPorId(citaInsertar.getMedico()).getFinAtencion());

		disponibilidadPaciente = citaService.obtenerPorHorarioCitaYPaciente(citaInsertar.getHorarioCita(),
				citaInsertar.getPaciente());
		disponibilidadMedico = citaService.obtenerPorHorarioCitaYMedico(citaInsertar.getHorarioCita(),
				citaInsertar.getMedico());
		try {
			horarioCita = Integer.parseInt(citaInsertar.getHorarioCita());
			outRangoCita = (horarioCita < horaInicial) || (horarioCita > horaFinal);

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public Cita validarRango(Cita cita) {

		horaInicial = Integer.parseInt(medicoService.obtenerPorId(cita.getMedico()).getInicioAtencion());
		horaFinal = Integer.parseInt(medicoService.obtenerPorId(cita.getMedico()).getFinAtencion());

		horarioCita = Integer.parseInt(cita.getHorarioCita());
		outRangoCita = (horarioCita < horaInicial) || (horarioCita > horaFinal);

		if (outRangoCita) {
			return null;
		} else {
			return cita;
		}
	}

}
