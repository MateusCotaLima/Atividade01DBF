package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Alimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentacaoRepository extends JpaRepository<Alimentacao, Long> {

}
