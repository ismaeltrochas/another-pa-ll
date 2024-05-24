package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.Rol;
import com.proyectodeaulas.trabajo.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RolController {

    private final RolService rolService;

    @PostMapping
    public Rol createRol(@RequestBody Rol rol) {
        return rolService.create(rol);
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Long id) {
        rolService.delete(id);
    }

    @GetMapping("/{id}")
    public Rol getRolById(@PathVariable Long id) {
        return rolService.findById(id);
    }

    @GetMapping
    public List<Rol> getAllRoles() {
        return rolService.findAll();
    }
}