package com.quileia.repo;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.quileia.entity.EntidadCita;


@Repository
public interface RepoCita extends JpaRepository<EntidadCita, Integer>, PagingAndSortingRepository<EntidadCita, Integer> {

	public Page<EntidadCita> findAll(Pageable pageable);

	public abstract Optional<EntidadCita> findByHorarioCitaEntidadAndPacienteEntidad(String horarioCita, String paciente);

	public abstract Optional<EntidadCita> findByHorarioCitaEntidadAndMedicoEntidad(String horarioCita, String medico);

}
