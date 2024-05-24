package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Reserva;
import com.proyectodeaulas.trabajo.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public Reserva create(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void delete(Long reservaId) {
        reservaRepository.deleteById(reservaId);
    }

    public Reserva findById(Long reservaId) {
        return reservaRepository.findById(reservaId).orElse(null);
    }

    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }
}
