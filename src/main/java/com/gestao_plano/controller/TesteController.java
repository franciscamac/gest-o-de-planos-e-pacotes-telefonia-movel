package com.gestao_plano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping
    public String welcome(){
        return "Hello World";
    }
}
