package com.quileia.assembler;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.quileia.entity.EntidadMedico;
import com.quileia.model.Medico;

@Component
public class ConvertidorMedicos {

	public List<Medico> convertirListaMedicos(List<EntidadMedico> entidadMedicos) {

		List<Medico> medicos = new ArrayList<>();

		for (EntidadMedico entidadMedico1 : entidadMedicos) {

			Medico medico = new Medico();

			medico.setNombre(entidadMedico1.getNombreEntidad());
			medico.setApellido(entidadMedico1.getApellidoEntidad());
			medico.setIdentificacion(entidadMedico1.getIdentificacionEntidad());
			medico.setTipoIdentificacion(entidadMedico1.getTipoIdentificacionEntidad());
			medico.setNumeroTarjetaProfesional(entidadMedico1.getNumeroTarjetaProfesionalEntidad());
			medico.setTiempoExperiencia(entidadMedico1.getTiempoExperienciaEntidad());
			medico.setEspecialidad(entidadMedico1.getEspecialidadEntidad());
			medico.setInicioAtencion(entidadMedico1.getInicioAtencionEntidad());
			medico.setFinAtencion(entidadMedico1.getFinAtencionEntidad());

			medicos.add(medico);
		}

		return medicos;
	}

	public Medico convertirMedico(EntidadMedico entidadMedico1) {

		List<EntidadMedico> entidadMedicos = new ArrayList<>();
		entidadMedicos.add(entidadMedico1);

		return convertirListaMedicos(entidadMedicos).get(0);
	}

	public EntidadMedico convertirEntidadMedico(Medico medico) {

		EntidadMedico entidadMedico = new EntidadMedico();

		entidadMedico.setNombreEntidad(medico.getNombre());
		entidadMedico.setApellidoEntidad(medico.getApellido());
		entidadMedico.setIdentificacionEntidad(medico.getIdentificacion());
		entidadMedico.setTipoIdentificacionEntidad(medico.getTipoIdentificacion());
		entidadMedico.setNumeroTarjetaProfesionalEntidad(medico.getNumeroTarjetaProfesional());
		entidadMedico.setTiempoExperienciaEntidad(medico.getTiempoExperiencia());
		entidadMedico.setEspecialidadEntidad(medico.getEspecialidad());
		entidadMedico.setInicioAtencionEntidad(medico.getInicioAtencion());
		entidadMedico.setFinAtencionEntidad(medico.getFinAtencion());

		return entidadMedico;
	}

}
