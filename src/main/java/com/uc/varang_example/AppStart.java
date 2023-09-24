package com.uc.varang_example;

import java.util.Arrays;

public class AppStart {
    private static int  average(int ...numbers){
        int aggregate=0;
        for (int number: numbers) {
            aggregate+=number;
        }
        return aggregate/numbers.length;
    }
    private static String average(String symbol,int ...numbers){
        int aggregate=0;
        for (int number: numbers) {
            aggregate+=number;
        }
        return symbol+" "+(aggregate/numbers.length);
    }
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,5,6,7,7));
        System.out.println(average("Ort",1,2,3,4,5,6,7,7));
    }
}
