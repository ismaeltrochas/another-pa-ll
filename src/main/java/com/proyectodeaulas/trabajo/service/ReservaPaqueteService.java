package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.ReservaPaquete;
import com.proyectodeaulas.trabajo.repository.ReservaPaqueteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservaPaqueteService {

    private final ReservaPaqueteRepository reservaPaqueteRepository;

    public ReservaPaquete create(ReservaPaquete categoria) {
        return reservaPaqueteRepository.save(categoria);
    }

    public void delete(Long categoria) {
        reservaPaqueteRepository.deleteById(categoria);
    }

    public ReservaPaquete findById(Long categoriaId) {
        return reservaPaqueteRepository.findById(categoriaId).orElse(null);
    }


    public List<ReservaPaquete> findAll() {
        return reservaPaqueteRepository.findAll();
    }

}
