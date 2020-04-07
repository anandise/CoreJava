package com.test;

class Employee{
    float salary=40000;
}
public class InheritanceEmployee extends Employee {

        int bonus=10000;
        public static void main(String args[]){
            InheritanceEmployee p=new InheritanceEmployee();
            System.out.println("Programmer salary is:"+p.salary);
            System.out.println("Bonus of Programmer is:"+p.bonus);
        }
    }

