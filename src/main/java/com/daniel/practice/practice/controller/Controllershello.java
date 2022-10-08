package com.daniel.practice.practice.controller;

import com.daniel.practice.practice.model.customerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controllershello {
    private customerService service;
    @Value("${my.hello}")
    String message;
    @GetMapping("/hello")
    public  String hello(){
        return message;
    }
    @GetMapping("/listofpeople")
    public List<customerService> myMethod() {
        return List.of(new customerService("Daniel",21,98558),
                new customerService("Ange",23,95458),
                new customerService("April",23,94458),
                new customerService("Patosa",23,95458))
                .stream().filter(n -> n.getName().contains("Daniel"))
                .collect(Collectors.toList());
    }

}
