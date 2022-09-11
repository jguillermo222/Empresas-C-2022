package com.empresa2.Repository;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="prueba")
public class PruebaConneccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private String apellido;
    private String email;
}
