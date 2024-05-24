package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.Local;
import com.proyectodeaulas.trabajo.service.LocalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locales")
@RequiredArgsConstructor
public class LocalController {

    private final LocalService localService;

    @PostMapping
    public Local createLocal(@RequestBody Local local) {
        return localService.create(local);
    }

    @DeleteMapping("/{id}")
    public void deleteLocal(@PathVariable Long id) {
        localService.delete(id);
    }

    @GetMapping("/{id}")
    public Local getLocalById(@PathVariable Long id) {
        return localService.findById(id);
    }

    @GetMapping
    public List<Local> getAllLocales() {
        return localService.findAll();
    }
}
