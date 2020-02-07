package com.example.api.xx.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.xx.demo.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}