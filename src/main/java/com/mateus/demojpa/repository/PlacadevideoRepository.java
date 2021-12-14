package com.mateus.demojpa.repository;

import com.mateus.demojpa.domain.Placadevideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacadevideoRepository extends JpaRepository<Placadevideo, Long> {

}
