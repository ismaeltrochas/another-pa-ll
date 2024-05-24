package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.Paquete;
import com.proyectodeaulas.trabajo.service.PaqueteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paquetes")
@RequiredArgsConstructor
public class PaqueteController {

    private final PaqueteService paqueteService;

    @PostMapping
    public Paquete createPaquete(@RequestBody Paquete paquete) {
        return paqueteService.create(paquete);
    }

    @DeleteMapping("/{id}")
    public void deletePaquete(@PathVariable Long id) {
        paqueteService.delete(id);
    }

    @GetMapping("/{id}")
    public Paquete getPaqueteById(@PathVariable Long id) {
        return paqueteService.findById(id);
    }

    @GetMapping
    public List<Paquete> getAllPaquetes() {
        return paqueteService.findAll();
    }
}
