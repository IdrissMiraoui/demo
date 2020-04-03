package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/root")
public class DemoController {

@Autowired
DemoService demoService;

    @GetMapping(value = "/demo")
    public ResponseEntity<String> getHello() {
        String value = demoService.getHello();
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

    @GetMapping(value = "/demo2")
    public ResponseEntity<String> getBonjour() {

        String value = demoService.getBonjour();
        return new ResponseEntity<>(value, HttpStatus.OK);
    }
}
