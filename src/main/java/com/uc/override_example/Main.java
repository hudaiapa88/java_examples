package com.uc.override_example;

public class Main {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.positionPrinter();
        System.out.println(employee.i);
        Employee manager= new Manager();
        manager.positionPrinter();
        System.out.println(manager.i);
        System.out.println(((Manager)manager).i);
        Employee ceo= new Ceo();
        ceo.positionPrinter();
        System.out.println(ceo.i);
    }
}
