package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Placamae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacamaeRepository extends JpaRepository<Placamae, Long> {

}
