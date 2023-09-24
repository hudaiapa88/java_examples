package com.uc.override_example;

public class Manager extends Employee{
    public static int i = 20;
    public static int e = 200;
    @Override
    public void positionPrinter(){
        System.out.println("Manager");
    }
}
