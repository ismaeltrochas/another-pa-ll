package com.proyectodeaulas.trabajo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paquete {
    private Long id;
    private String nombre;
    private String descripcion;

}
