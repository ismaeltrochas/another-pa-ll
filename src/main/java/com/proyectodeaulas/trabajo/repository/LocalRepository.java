package com.proyectodeaulas.trabajo.repository;

import com.proyectodeaulas.trabajo.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
}
