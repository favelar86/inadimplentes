package com.ada.inadimplentes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inadimplentes")
public class InadimplentesController {

    @GetMapping
    public String olaMundo() {

        return "Hello World Spring!";
    }

}
