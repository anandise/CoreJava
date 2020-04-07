package com.java.basics;

public class StaticExe {



    int id;
    int sal;
    static String company = "Accenture LLC";

    StaticExe(int id, int sal) {
        this.id = id;
        this.sal=sal;
    }



    void disp(){
        System.out.println(id+" "+sal+" "+company);
    }




    public static void main(String[] args){

        StaticExe emp1= new StaticExe(5 , 200);
        StaticExe emp2= new StaticExe(10,500);
        emp1.disp();
        emp2.disp();



    }
}
