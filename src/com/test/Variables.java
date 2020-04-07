package com.test;

public class Variables {
    //Local- method level,Instance- instance level, class/static- class level

    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Variables (String empName) {
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }

    public void pupAge() {
            int age = 0; //local variable
            age = age + 7;
            System.out.println("Puppy age is : " + age);
        }

        public static void main(String args[]) {

        Variables empOne = new Variables("Ransika");
            empOne.setSalary(1000);
            empOne.printEmp();
            empOne.pupAge();
        }
    }

