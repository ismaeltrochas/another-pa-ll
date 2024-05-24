package com.proyectodeaulas.trabajo.repository;

import com.proyectodeaulas.trabajo.entity.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaqueteRepository extends JpaRepository<Paquete, Long> {
}
