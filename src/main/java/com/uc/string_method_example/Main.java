package com.uc.string_method_example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text="Ali,Ahmet,Ayşe,Hasan,Hasan Ali";
        List<String> textList= Arrays.asList(text.split(","));
       List<String> textl= textList.stream().map((t)->t.substring(0,1)).collect(Collectors.toList());
       System.out.println(textl);
    }
}
