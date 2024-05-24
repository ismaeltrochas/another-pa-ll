package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.Servicio;
import com.proyectodeaulas.trabajo.service.ServicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/servicios")
@RequiredArgsConstructor
public class ServicioController {

    private final ServicioService servicioService;

    @PostMapping
    public Servicio createServicio(@RequestBody Servicio servicio) {
        return servicioService.create(servicio);
    }

    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable Long id) {
        servicioService.delete(id);
    }

    @GetMapping("/{id}")
    public Servicio getServicioById(@PathVariable Long id) {
        return servicioService.findById(id);
    }

    @GetMapping
    public List<Servicio> getAllServicios() {
        return servicioService.findAll();
    }
}