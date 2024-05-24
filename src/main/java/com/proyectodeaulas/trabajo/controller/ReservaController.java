package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.Reserva;
import com.proyectodeaulas.trabajo.service.ReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService reservaService;

    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva) {
        return reservaService.create(reserva);
    }

    @DeleteMapping("/{id}")
    public void deleteReserva(@PathVariable Long id) {
        reservaService.delete(id);
    }

    @GetMapping("/{id}")
    public Reserva getReservaById(@PathVariable Long id) {
        return reservaService.findById(id);
    }

    @GetMapping
    public List<Reserva> getAllReservas() {
        return reservaService.findAll();
    }
}