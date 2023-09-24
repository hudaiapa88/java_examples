package com.uc.functional_interface_example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     ProcessFunction<Integer,Integer> processFunction=(Integer[] x) -> Arrays.stream(x).reduce(0,(s,y)->s+y);
     Integer a= processFunction.process(1,2,3);
     System.out.println(a);


     Processor processor= new Processor();
     processor.process(processFunction);
    }
}
