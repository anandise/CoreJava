package com.test;

public class Strings {
    public static void main(String[] args){
        //compare,isempty,toUpperCase, valueOf, replace, Contains, equals,charAt,endsWith
        String s= "AnandUllagaddi";
        System.out.println(s.length());
        System.out.println(s.substring(5));

        System.out.println(s.toUpperCase());//
        System.out.println(s.toLowerCase());//
        System.out.println(s);//(no change in original)

        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(when s1>s3)
        System.out.println(s3.compareTo(s1));//-1(when s3 < s1 )


    }
}
