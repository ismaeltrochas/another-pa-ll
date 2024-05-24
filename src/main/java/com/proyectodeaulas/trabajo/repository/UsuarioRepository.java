package com.proyectodeaulas.trabajo.repository;

import com.proyectodeaulas.trabajo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmailAndClave(String email, String clave);
}
