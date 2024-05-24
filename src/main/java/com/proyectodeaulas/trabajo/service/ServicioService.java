package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Servicio;
import com.proyectodeaulas.trabajo.repository.ServicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioService {

    private final ServicioRepository servicioRepository;

    public Servicio create(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    public void delete(Long servicioId) {
        servicioRepository.deleteById(servicioId);
    }

    public Servicio findById(Long servicioId) {
        return servicioRepository.findById(servicioId).orElse(null);
    }

    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }
}