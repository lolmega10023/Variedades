package com.exe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ViewController {
    @GetMapping("/")
    public String index() {
        return "Index";
    }
    @GetMapping("/Persona")
    public String personas() {
        return "Tabla";
    }
    
}
