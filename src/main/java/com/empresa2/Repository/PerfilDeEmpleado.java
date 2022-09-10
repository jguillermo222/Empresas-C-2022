package com.empresa2.Repository;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Entity
//Table(name="perfil")
public class PerfilDeEmpleado {

    @Getter @Setter
    //@Id
    //GeneratedValue(strategy = GenerationType.Identity)
    private String cedula;
    //@Column
    private String image;
    //@Column
    private String telefono;
    //@Column
    private String celular;
    //@Column
    private Date fechaDeCreacion;
    //@Column
    private Date fechaDeActualizacion;

    //conector
    //@OneToOne
    //@JoinColumn(name = profile)
    //private User user;

}
