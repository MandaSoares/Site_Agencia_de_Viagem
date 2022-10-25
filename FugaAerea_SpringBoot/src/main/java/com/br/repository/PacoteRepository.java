package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.Pacote;

public interface PacoteRepository extends JpaRepository<Pacote, Long> {
	
}
