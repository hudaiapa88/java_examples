package com.uc.access_provider_example;

import com.uc.access_provider_example.model.User;

public class AccessInParentPackage {
    private static  final String name="AccessInParentPackage";
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
        User user = new User();
        user.publicMethod();
    }
}
