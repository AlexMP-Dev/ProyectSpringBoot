package com.uns.proyectspring2.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;

    private String nombre;

    @Column(name ="fechanac")
    private LocalDate fechaNacimiento;

    private String celular;
    private String email;

}
