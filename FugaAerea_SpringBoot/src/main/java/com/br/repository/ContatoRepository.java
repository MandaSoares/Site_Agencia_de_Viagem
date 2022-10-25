package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
