package com.proyectodeaulas.trabajo.service;

import com.proyectodeaulas.trabajo.entity.Local;
import com.proyectodeaulas.trabajo.repository.LocalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LocalService {


    private final LocalRepository localRepository;

    public Local create(Local categoria) {
        return localRepository.save(categoria);
    }

    public void delete(Long categoria) {
        localRepository.deleteById(categoria);
    }

    public Local findById(Long categoriaId) {
        return localRepository.findById(categoriaId).orElse(null);
    }


    public List<Local> findAll() {
        return localRepository.findAll();
    }

}
