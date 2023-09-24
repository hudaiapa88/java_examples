package com.uc.access_provider_example.model;

public class AccessInPackage {
    private static final String name="AccessInPackage";
    private static void classNameScreenWriter(){
        System.out.println(name);
    }
    private static void separatorScreenWriter(){
        System.out.println("---------------");
    }
    public static void access(){
        separatorScreenWriter();
        classNameScreenWriter();
        separatorScreenWriter();
        User user= new User();
        user.protectedMethod();
        user.publicMethod();
        user.defaultMethod();
    }
}
