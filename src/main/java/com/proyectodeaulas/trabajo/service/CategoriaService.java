package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Categoria;
import com.proyectodeaulas.trabajo.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void delete(Long categoria) {
        categoriaRepository.deleteById(categoria);
    }

    public Categoria findById(Long categoriaId) {
        return categoriaRepository.findById(categoriaId).orElse(null);
    }


    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

}
