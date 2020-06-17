package com.quileia;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.quileia.assembler.ConvertidorPacientes;
import com.quileia.factory.FabricaModelos;
import com.quileia.model.Paciente;
import com.quileia.repo.RepoPaciente;

@SpringBootTest
class ComprobacionPacientes {

	private Paciente paciente1;
	private Paciente pacienteRetornado;
	private Paciente paciente2;

	@Autowired
	private RepoPaciente repoPaciente;

	@Autowired
	private ConvertidorPacientes convertidorPacientes;

	@BeforeEach
	void inicializandMedico() {

		paciente1 = FabricaModelos.construirModeloPaciente();
		pacienteRetornado = new Paciente();
	}

	@AfterEach
	void reset() {

		paciente1 = null;
		pacienteRetornado = null;
	}

	@Test
	void insercionPaciente() {

		pacienteRetornado = convertidorPacientes
				.convertirPaciente(repoPaciente.save(convertidorPacientes.convertirEntidadPaciente(paciente1)));

		assertTrue(paciente1.equals(pacienteRetornado));

	}

	@Test
	void comparacionFallida() {

		assertFalse(paciente1.equals(pacienteRetornado));
	}

	@Test
	void insercionNula() {
		assertThrows(Exception.class, () -> repoPaciente.save(convertidorPacientes.convertirEntidadPaciente(paciente2)));

	}

	@Test
	void modificarPaciente() {

		pacienteRetornado = convertidorPacientes.convertirPaciente(repoPaciente.findById("001").get());
		pacienteRetornado.setNombre("fulano");
		repoPaciente.save(convertidorPacientes.convertirEntidadPaciente(pacienteRetornado));

		assertTrue(repoPaciente.findById("001").get().getNombreEntidad().equalsIgnoreCase(pacienteRetornado.getNombre()));
	}

	@Test
	void borrarMedico() {

		assertThrows(Exception.class, () ->

		repoPaciente.deleteById(repoPaciente.findById("27278").get().getIdentificacionEntidad()));

	}

}
