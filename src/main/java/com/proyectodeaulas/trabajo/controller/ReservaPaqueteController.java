package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.ReservaPaquete;
import com.proyectodeaulas.trabajo.service.ReservaPaqueteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservapaquetes")
@RequiredArgsConstructor
public class ReservaPaqueteController {

    private final ReservaPaqueteService reservaPaqueteService;

    @PostMapping
    public ReservaPaquete createReservaPaquete(@RequestBody ReservaPaquete reservaPaquete) {
        return reservaPaqueteService.create(reservaPaquete);
    }

    @DeleteMapping("/{id}")
    public void deleteReservaPaquete(@PathVariable Long id) {
        reservaPaqueteService.delete(id);
    }

    @GetMapping("/{id}")
    public ReservaPaquete getReservaPaqueteById(@PathVariable Long id) {
        return reservaPaqueteService.findById(id);
    }

    @GetMapping
    public List<ReservaPaquete> getAllReservaPaquetes() {
        return reservaPaqueteService.findAll();
    }
}
