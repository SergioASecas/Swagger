package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/saludo")
    public String getMethodName() {
        return "Hola";
    }
    
    
}
