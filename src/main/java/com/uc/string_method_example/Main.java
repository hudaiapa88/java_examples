package com.uc.string_method_example;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text= "c/wqerw/dgdfhgf/bfbfb/bfdbd/dgvdfgd/akd.jpeg";
        Path path= Path.of(text);
        String sPath=path.toString().substring(0,text.lastIndexOf("."))+".txt";
        System.out.println(Path.of(sPath).toString());
      //  System.out.println(text.substring(0,text.lastIndexOf(".")));
       /* String text="Ali,Ahmet,Ayşe,Hasan,Hasan Ali";
        List<String> textList= Arrays.asList(text.split(","));
       List<String> textl= textList.stream().map((t)->t.substring(0,1)).collect(Collectors.toList());
       System.out.println(textl);*/
    }
}
