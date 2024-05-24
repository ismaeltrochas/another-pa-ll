package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Paquete;
import com.proyectodeaulas.trabajo.repository.PaqueteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaqueteService {

    private final PaqueteRepository paqueteRepository;

    public Paquete create(Paquete categoria) {
        return paqueteRepository.save(categoria);
    }

    public void delete(Long categoria) {
        paqueteRepository.deleteById(categoria);
    }

    public Paquete findById(Long categoriaId) {
        return paqueteRepository.findById(categoriaId).orElse(null);
    }


    public List<Paquete> findAll() {
        return paqueteRepository.findAll();
    }

}
