package com.uc.class_example.anonim_class_example;

public class Main {
    public static void main(String[] args) {
        School school= new School(){
            @Override
            public String getTitle(){
             return "hello";
            }

        };
        System.out.println(school.getTitle());

    }
}
