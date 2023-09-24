package com.uc.mutable_immutable_example;

public class AppStart {
    public static void main(String[] args) {
        Immutable immutable=new Immutable("Hudai");
        System.out.println(immutable.titleAdd(" APA").getTitle());
        System.out.println(immutable.getTitle());
    }
}
