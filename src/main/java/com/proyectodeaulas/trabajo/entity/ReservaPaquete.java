package com.proyectodeaulas.trabajo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservaPaquete {

    private Long id;
    private Long paquete;
    private Long usuario;

}
