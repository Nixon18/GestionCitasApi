package com.quileia;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import com.quileia.assembler.ConvertidorCitas;
import com.quileia.assembler.ConvertidorMedicos;
import com.quileia.assembler.ConvertidorPacientes;
import com.quileia.model.Cita;
import com.quileia.model.Medico;
import com.quileia.model.Paciente;
import com.quileia.repo.RepoCita;
import com.quileia.repo.RepoMedico;
import com.quileia.repo.RepoPaciente;

@SpringBootTest
class Preparacion {

	@Autowired
	private RepoMedico repoMedico;

	@Autowired
	private RepoPaciente repoPaciente;

	@Autowired
	private RepoCita repoCita;

	@Autowired
	private ConvertidorMedicos convertidorMedicos;
	@Autowired
	private ConvertidorPacientes convertidorPacientes;
	@Autowired
	private ConvertidorCitas convertidorCitas;

	@Test
	@Sql(scripts = "/formatearEntidades.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	void validarPreparacion() {
		List<Medico> medicos = convertidorMedicos.convertirListaMedicos(repoMedico.findAll());

		assertTrue(medicos.isEmpty());

		List<Paciente> pacientes = convertidorPacientes.convertirListaPacientes(repoPaciente.findAll());

		assertTrue(pacientes.isEmpty());

		List<Cita> citas = convertidorCitas.convertirListaCitas(repoCita.findAll());

		assertTrue(citas.isEmpty());

	}

}
