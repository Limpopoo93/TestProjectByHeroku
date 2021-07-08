package com.test.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/index")
    public ResponseEntity<String> listAllFunFiction() {
        String text = "hello world rest full";
        return new ResponseEntity<>(text, HttpStatus.OK);
    }
}
