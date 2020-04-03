package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    DemoRepository demoRepository;

    @Override
    public String getHello() {
        return demoRepository.getHello();
        //return "Hello World";
    }

    @Override
    public String getBonjour() {
        return "Hello Bonjour";
    }
}
