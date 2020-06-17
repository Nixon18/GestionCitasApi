package com.quileia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.quileia.assembler.ConvertidorMedicos;
import com.quileia.factory.FabricaModelos;
import com.quileia.model.Medico;
import com.quileia.repo.RepoMedico;

@SpringBootTest
class ComprobacionMedicos {

	private Medico medico1;
	private Medico medicoRetornado;
	private Medico medico2;

	@Autowired
	private RepoMedico repoMedico;

	@Autowired
	private ConvertidorMedicos convertidorMedicos;

	@BeforeEach
	void inicializandMedico() {

		medico1 = FabricaModelos.construirModeloMedico();
		medicoRetornado = new Medico();
	}

	@AfterEach
	void reset() {

		medico1 = null;
		medicoRetornado = null;
	}

	@Test
	void insercionMedico() {

		medicoRetornado = convertidorMedicos
				.convertirMedico(repoMedico.save(convertidorMedicos.convertirEntidadMedico(medico1)));

		assertTrue(medico1.equals(medicoRetornado));

	}

	@Test
	void comparacionFallida() {

		assertFalse(medico1.equals(medicoRetornado));
	}

	@Test
	void insercionNula() {
		assertThrows(Exception.class, () -> repoMedico.save(convertidorMedicos.convertirEntidadMedico(medico2)));

	}

	@Test
	void modificarMedico() {

		medicoRetornado = convertidorMedicos.convertirMedico(repoMedico.findById("11").get());
		medicoRetornado.setNombre("ronaldinho");
		repoMedico.save(convertidorMedicos.convertirEntidadMedico(medicoRetornado));

		assertTrue(repoMedico.findById("11").get().getNombreEntidad().equalsIgnoreCase(medicoRetornado.getNombre()));
	}

	@Test
	void borrarMedico() {

		assertThrows(Exception.class, () ->

		repoMedico.deleteById(repoMedico.findById("27278").get().getIdentificacionEntidad()));

	}

}
