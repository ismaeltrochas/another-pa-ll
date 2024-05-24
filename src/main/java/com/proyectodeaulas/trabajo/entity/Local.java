package com.proyectodeaulas.trabajo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Local {

    private Long id;
    private String nombre;
    private String ubicacion;
    private Double precio;
    private Long categoria;

}
