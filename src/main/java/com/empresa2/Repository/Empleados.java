package com.empresa2.Repository;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Entity
//Table(name="empleados")
public class Empleados {

    @Getter @Setter
    //@Id
    //GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpleado;

    //@Column (unique = true)
    private String mail;

    //@Column
    //@Enumerated(value=Enum_rol.STRING)
    //private Enum_NombreRol rol;

    //@Column
    private Date fechaDeCreacion;

    //@Column
    private String fechaDeActualizacion;

    //Conector

    //@OneToMany(mappedBy = "user")
    //private Profile profile;
    //@ManyToOne
    //@JoinColumn(name = users)
    //private Enterprise enterprise;
    //@OneToMany(mappedBy = "user")
    //private Transaccion[] transaccion;




}
