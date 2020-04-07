package com.java.basics;

public class ClassAndObjects {

    void printMsg(){
        System.out.println("Printing from printMsg method");
    }

    public static void main(String[] args){
        ClassAndObjects obj= new ClassAndObjects();
        obj.printMsg();

    }
}
