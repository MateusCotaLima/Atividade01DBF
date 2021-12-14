package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Armazenamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmazenamentoRepository extends JpaRepository<Armazenamento, Long> {

}
