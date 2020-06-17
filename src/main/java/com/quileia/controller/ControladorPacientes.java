package com.quileia.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.quileia.model.Paciente;
import com.quileia.services.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/pacientes")
public class ControladorPacientes {

	@Autowired
	PacienteService pacienteService;

	@Autowired
	ValidandoDatos validadorRegistros;

	@GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<Paciente> cargarPacientes(Pageable pageable) {

		return pacienteService.obtenerPorPaginacion(pageable);

	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public Paciente cargarPaciente(@PathVariable("id") String id) {

		return pacienteService.obtenerPorId(id);
	}

	@DeleteMapping(value = "/{id}")
	public Paciente eliminarPaciente(@PathVariable("id") String id) {

		return pacienteService.borrar(id);

	}

	@PutMapping(path = "/{id}")
	public Paciente actualizarPaciente(@RequestBody @Valid Paciente pacienteActualizar, @PathVariable("id") String id) {

		pacienteActualizar.setIdentificacion(id);

		return pacienteService.crear(pacienteActualizar);

	}

	@PostMapping
	public Paciente insertarPaciente(@RequestBody @Valid Paciente pacienteActualizar) {

		return pacienteService.crear(pacienteActualizar);

	}

}
