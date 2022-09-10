package com.empresa2.Repository;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Entity
//Table(name="transacciones")
public class Transacciones {

    @Getter @Setter

    //@Id
    //GeneratedValue(strategy = GenerationType.AUTO)
    private long idTransaccion;
    //@Column
    private String concept;
    //@Column
    private float monto;
    //@Column
    private Date fechaDeCreacion;
    //@Column
    private Date fechaDeActualizacion;


    //connectores
    //@ManyToOne
    //@JoinColumn(name = transaccion)
    //private User user;
    //@ManyToOne
    //@JoinColumn(name = transacciones)
    //private Enterprise enterprise;




}
