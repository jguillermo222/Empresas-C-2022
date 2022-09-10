package com.empresa2.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola") // imprime hola en el host:8080/hola

public class Controlador {

    @GetMapping
    public String decirHola (){return "hola mundo";}


}
