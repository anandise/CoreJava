package com.java.basics;

public class ConstOverload {

    int item;
    int price;
    String name;

    ConstOverload(int a, int b){
        item= a;
        price=b;
        name="ABC";
        System.out.println(item+" " +price+" "+name);
    }

    ConstOverload(int x, int y, String str){
        item=x;
        price=y;
        name=str;
        System.out.println(item+" " +price+" "+name);

    }

    public static void main(String []args) {

        ConstOverload s1= new ConstOverload(1,20);
        ConstOverload s2= new ConstOverload(1,20, "2nditem");


    }
}
