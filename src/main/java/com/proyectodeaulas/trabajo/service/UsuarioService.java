package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Usuario;
import com.proyectodeaulas.trabajo.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

    public Usuario findById(Long usuarioId) {
        return usuarioRepository.findById(usuarioId).orElse(null);
    }

    public Usuario loginUser(String email, String clave) {
        return usuarioRepository.findByEmailAndClave(email, clave);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}