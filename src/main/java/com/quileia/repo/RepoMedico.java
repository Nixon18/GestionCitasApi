package com.quileia.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.quileia.entity.EntidadMedico;


@Repository
public interface RepoMedico extends JpaRepository<EntidadMedico, String>, PagingAndSortingRepository<EntidadMedico, String> {

	public Page<EntidadMedico> findAll(Pageable pageable);

}
