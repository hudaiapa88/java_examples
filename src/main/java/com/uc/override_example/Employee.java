package com.uc.override_example;

public  class Employee {
    public static int i = 10;
    public static int e = 100;
    public void positionPrinter(){
        System.out.println("Employee");
    }
    public Employee get(){
        return this;
    }
}
