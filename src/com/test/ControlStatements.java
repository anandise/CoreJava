package com.test;

public class ControlStatements {
    //Decision Making- IfElse,Switch
    //Iteration- For, While, DoWhile
    //Jump-Break,Continue,Return
    public static void main(String[] args) {
        int e=100;
        int f=200;

        boolean x1=e>f;

        System.out.println(x1);

        // IF statements
        if(e<f){
            System.out.println("e is lesser");
        }else if(e==f){
            System.out.println("e is equal to f");
        }else{
            System.out.println("e is greater");
        }

        int i = 0;

        while (i < 10) {
            System.out.println("value of i is " + i);
            i = i + 1;
        }

        System.out.println("****************************");
        for (int t_no = 1; t_no <= 10; t_no++) {
            System.out.println("TABLE OF -- " + t_no);
            for (int x = 1; x <= 10; x = x + 1) {
                System.out.println(t_no + " * " + x + " = " + t_no * x);
            }
        }


        for (int q = 1000; q < 50000; q++) {
            System.out.println(q);

            if (q == 1010) {
                break; // come out of the for loop
            }
        }

        for(int m=1;m<=10;m++){
            if(m==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(m);
        }
    }
}