package com.test;

public class StringBufferEx {
    //append,Insert, replace,delete,reverse,capacity

    public static void main(String args[]){

        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb.capacity());//now 16

        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
        System.out.println(sb.capacity());

        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints HJavaelloJava

        sb.replace(1,3,"Java");
        System.out.println(sb);//HJavavaelloJava

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);//prints olleH

        System.out.println(sb.capacity());
    }
}
