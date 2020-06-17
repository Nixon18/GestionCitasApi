package com.quileia.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.quileia.entity.EntidadPaciente;

@Repository
public interface RepoPaciente
		extends JpaRepository<EntidadPaciente, String>, PagingAndSortingRepository<EntidadPaciente, String> {
	public Page<EntidadPaciente> findAll(Pageable pageable);
}
