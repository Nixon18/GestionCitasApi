package com.quileia.factory;

import org.springframework.stereotype.Service;
import com.quileia.model.Cita;
import com.quileia.model.Medico;
import com.quileia.model.Paciente;

@Service
public class FabricaModelos {

	private FabricaModelos() {
	}

	public static Medico construirModeloMedico() {

		Medico medico = new Medico();

		medico.setNombre("andrea");
		medico.setApellido("pirlo");
		medico.setIdentificacion("19");
		medico.setTipoIdentificacion("cedula");
		medico.setNumeroTarjetaProfesional("34343");
		medico.setTiempoExperiencia((float) 10);
		medico.setEspecialidad("cardiologo");
		medico.setInicioAtencion("6");
		medico.setFinAtencion("18");

		return medico;

	}

	public static Paciente construirModeloPaciente() {

		Paciente paciente = new Paciente();

		paciente.setNombre("sofia");
		paciente.setFechaNacimiento("18/12/1996");
		paciente.setIdentificacion("009");
		paciente.setTipoIdentificacion("cedula");
		paciente.setEps("coomeva");
		paciente.setHistoriaClinica("paciente con dolor de cabeza");

		return paciente;

	}

	public static Cita construirModeloCita() {

		Cita cita = new Cita();

		cita.setMedico("12");
		cita.setPaciente("002");
		cita.setHorarioCita("12");

		return cita;

	}

}
