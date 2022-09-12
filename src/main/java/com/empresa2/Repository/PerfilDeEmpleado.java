package com.empresa2.Repository;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="perfil")
@Data

public class PerfilDeEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cedula;
    @Column
    private String image;
    @Column
    private String telefono;
    @Column
    private String celular;
    @Column
    private Date fechaDeCreacion;
    @Column
    private Date fechaDeActualizacion;

    //connectores






}
