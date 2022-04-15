package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/message")
public class testController{
    @GetMapping("/hello")
    public ResponseEntity<String>get(){
        return ResponseEntity.ok("Hello cool IT help!");
    }
}