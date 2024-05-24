package com.proyectodeaulas.trabajo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

    private Long id;
    private Long local;
    private Long usuario;
    private String estado;

}
