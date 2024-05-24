package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Rol;
import com.proyectodeaulas.trabajo.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RolService {

    private final RolRepository rolRepository;

    public Rol create(Rol rol) {
        return rolRepository.save(rol);
    }

    public void delete(Long rolId) {
        rolRepository.deleteById(rolId);
    }

    public Rol findById(Long rolId) {
        return rolRepository.findById(rolId).orElse(null);
    }

    public List<Rol> findAll() {
        return rolRepository.findAll();
    }
}