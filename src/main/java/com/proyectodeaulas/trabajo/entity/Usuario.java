package com.proyectodeaulas.trabajo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String documento;
    private String email;
    private String clave;
    private String rol;
}
