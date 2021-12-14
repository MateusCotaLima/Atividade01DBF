package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Escolha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolhaRepository extends JpaRepository<Escolha, Long> {

}
