package com.priyanshu.servises;

public class Password {
    String algo;
    public Password(String algo){
        this.algo = algo;
        System.out.println("Password bean created");
    }
    public void passWordAlgoUsed(){
        System.out.println("The algo used for password is "+algo);
    }
}
