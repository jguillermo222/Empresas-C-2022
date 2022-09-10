package com.empresa2.Repository;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Entity
//Table(name="empresa")
public class Empresa {

    @Getter @Setter
    //@Id
    //@GeneratedValue (Strategy = GenerationType.IDENTUTY)
    private Long idEmpresa;

    //@Column (unique=true)
    private String nombre;

    //@Column (unique=true)
    private String documento;

    //@Column
    private String telefono;

    //@Column
    private String direccion;

    //@Column
    private Date fechaDeCreacion;

    //@Column
    private Date fechaDeActualizacion;

    //connector

    //@OneToMany(mappedBy = "enterprise")
    //private User[] users;

    //@OneToMany(mappedBy = "enterprise")
    //Private Transacciones transacciones;

}
