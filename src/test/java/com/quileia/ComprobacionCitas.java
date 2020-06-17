package com.quileia;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.quileia.assembler.ConvertidorCitas;
import com.quileia.factory.FabricaModelos;
import com.quileia.model.Cita;
import com.quileia.repo.RepoCita;


@SpringBootTest
class ComprobacionCitas {

	private Cita cita1;
	private Cita citaRetornada;
	private Cita cita2;

	@Autowired
	private RepoCita repoCita;

	@Autowired
	private ConvertidorCitas convertidorCitas;

	@BeforeEach
	void inicializandMedico() {

		cita1 = FabricaModelos.construirModeloCita();
		citaRetornada = new Cita();
	}

	@AfterEach
	void reset() {

		cita1 = null;
		citaRetornada = null;
	}

	@Test
	void insercionCita() {

		citaRetornada = convertidorCitas
				.convertirCita(repoCita.save(convertidorCitas.convertirEntidadCita(cita1)));

		assertFalse(cita1.equals(citaRetornada));

	}

	@Test
	void comparacionFallida() {

		assertFalse(cita1.equals(citaRetornada));
	}

	@Test
	void insercionNula() {
		assertThrows(Exception.class, () -> repoCita.save(convertidorCitas.convertirEntidadCita(cita2)));

	}

	@Test
	void modificarCita() {

		citaRetornada = convertidorCitas.convertirCita(repoCita.findByHorarioCitaEntidadAndMedicoEntidad("11", "11").get());
		citaRetornada.setHorarioCita("12");
		repoCita.save(convertidorCitas.convertirEntidadCita(citaRetornada));

		assertTrue(repoCita.findByHorarioCitaEntidadAndMedicoEntidad("12", "11").get().getHorarioCitaEntidad().equalsIgnoreCase(citaRetornada.getHorarioCita()));
	}

	@Test
	void borrarCita() {

		assertThrows(Exception.class, () ->

		repoCita.deleteById(repoCita.findByHorarioCitaEntidadAndMedicoEntidad("41", "11").get().getRegistroEntidad()));

	}

}
