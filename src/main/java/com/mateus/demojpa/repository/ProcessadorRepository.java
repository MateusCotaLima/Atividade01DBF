package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Processador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessadorRepository extends JpaRepository<Processador, Long> {

}
