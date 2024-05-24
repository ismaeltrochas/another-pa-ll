package com.proyectodeaulas.trabajo.controller;

import com.proyectodeaulas.trabajo.entity.Categoria;
import com.proyectodeaulas.trabajo.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaService.create(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        categoriaService.delete(id);
    }

    @GetMapping("/{id}")
    public Categoria getCategoriaById(@PathVariable Long id) {
        return categoriaService.findById(id);
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaService.findAll();
    }
}
