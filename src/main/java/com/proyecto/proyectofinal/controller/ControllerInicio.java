package com.proyecto.proyectofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class ControllerInicio {
    String carpeta = "menu/";
    @RequestMapping("/")
    public String inicio(){
        return carpeta+"inicio";
    }

    @RequestMapping("/login")
    public String login(){
        return carpeta+"login";
    }
    
}
