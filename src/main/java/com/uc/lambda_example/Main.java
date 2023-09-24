package com.uc.lambda_example;

public class Main {
    public static void main(String[] args) {
        Writer writer= (text)->{
          System.out.println(text);
        };
        writer.write("hello");



    }
}
