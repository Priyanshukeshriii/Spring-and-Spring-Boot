package com.priyanshu.web;

import org.springframework.stereotype.Controller;

@Controller //web is the bean of this class
public class Web {
    public Web(){
        System.out.println("Web bean is created");
    }
}
