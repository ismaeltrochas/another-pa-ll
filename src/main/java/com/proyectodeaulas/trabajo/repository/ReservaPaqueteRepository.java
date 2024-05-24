package com.proyectodeaulas.trabajo.repository;

import com.proyectodeaulas.trabajo.entity.ReservaPaquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaPaqueteRepository extends JpaRepository<ReservaPaquete, Long> {
}
