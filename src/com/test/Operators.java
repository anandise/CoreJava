package com.test;

public class Operators {
    //postfix,prefix,arithmetic,shift,relational,equality,bitwise,logical,ternary, assignment
    public static void main(String[] args) {
        String x="hello howzz u";

        int a=1000;
        int b=200;
        int c=300;
        //+ -- concatination operator
        System.out.println("value of a is " + a);
        System.out.println(a+b);
        System.out.println("sum of a and b is "+ a + b);
        System.out.println("sum of a and b is "+ (a + b));
        System.out.println(a+b+" is the sum of a and b");


        // || &&
        // >  <  >= <= == !=
        if(a>b && a>c){
            System.out.println("a is the greatest "+a);
        }else if(b>c){
            System.out.println("b is greatest "+b);
        }else{
            System.out.println("c is greatest "+ c);
        }


        if(b!=c){
            System.out.println("b is not equal to c");
        }


        String p="selenium class";
        String o="selenium class";
        // never compare string s like this
        if(p==o){

        }

        if(p.equals(o)){
            System.out.println("p and o are equal");
        }else{
            System.out.println("p and o are unequal");
        }

        int i =1;
        i++;// i i+i
        // use value of i and then increment it
        System.out.println(i++);
        System.out.println(i); // 3

        int n=2;
        int m=n++;

        System.out.println("y is "+ m);
        System.out.println("x is "+ n);

        // preincrement
        // first value is incremented and then used
        int z=9;
        System.out.println(++z);
        int u=8;
        int q=++u;
        System.out.println(" p is "+q);
        System.out.println(" u is "+u);

        //x++ x--  post increment op
        //++x --x  preincrement operators



        int a1, b1;
        a1 = 10;
        b1 = (a1 == 1) ? 20: 30;
        System.out.println( "Value of b1 is : " +  b1 );

        b = (a1 == 10) ? 20: 30;
        System.out.println( "Value of b1 is : " + b1 );

        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

    }


}
