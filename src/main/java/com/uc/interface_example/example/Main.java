package com.uc.interface_example.example;

public class Main {
    public static void main(String[] args) {
        StringUtil stringUtil=new TextUtil("abcdefg");
        System.out.println(stringUtil.deleteChar(1).getValue());

    }
}
