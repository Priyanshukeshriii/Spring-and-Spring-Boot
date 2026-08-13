package com.priyanshu.servises;

import org.springframework.stereotype.Service;

@Service("Servises")
public class Servise {
    public Servise() {
        System.out.println("Servise bean is created");
    }
}
