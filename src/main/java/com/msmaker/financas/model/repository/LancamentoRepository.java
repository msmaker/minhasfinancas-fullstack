package com.msmaker.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
