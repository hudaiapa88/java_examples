package com.uc.reflection_example;

public class AppStart {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> testClass=Class.forName("com.uc.reflection_example.Person");
        System.out.println(testClass);
    }
}
