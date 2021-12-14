package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Gabinete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GabineteRepository extends JpaRepository<Gabinete, Long> {

}
