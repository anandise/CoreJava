package com.test;

public class HelloWorld {

    public void nonStatic() {
        // write your code here
        System.out.println("Non StaticExe Method invoked with obj");

    }
    public static void staticMethod() {
        // write your code here
        System.out.println("StaticExe Method can be invoked without creating object");

    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

        HelloWorld obj= new HelloWorld();
        obj.nonStatic();
        staticMethod();

    }
}
