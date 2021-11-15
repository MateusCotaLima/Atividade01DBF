package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Memoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoriaRepository extends JpaRepository<Memoria, Long> {

}
