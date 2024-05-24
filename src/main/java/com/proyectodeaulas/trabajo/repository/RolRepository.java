package com.proyectodeaulas.trabajo.repository;

import com.proyectodeaulas.trabajo.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
