package com.test;

public class Methods {
    // function -> control comes - first time
    public static void main(String[] args) {
        System.out.println("start");

        printCourseName();
        printCourseName();
        printCourseName();
        int r = addNumbers(89,76,88,"hello");
        System.out.println("Returned result is -- " + r);
        r = addNumbers(819,726,838,"hello");
        System.out.println("Returned result is -- " + r);
        System.out.println("end");

        int res= calculateFacorial(15);
        System.out.println("Factorial is "+ res);


    }

    // function body // 0 ip and 0 op
    public static void printCourseName(){
        System.out.println("Course is Selenium with Java");
    }
    // 4 ip 0 op
    public static int addNumbers(int a, int b, int c,String x){
        int result = a+b+c;
        System.out.println("Result is " + result);
        return result;
    }
    //factorial method
    public static int calculateFacorial(int n) {
        // 5 - 5*4*3*2*1
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        return result;

    }

}
