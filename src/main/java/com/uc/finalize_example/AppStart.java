package com.uc.finalize_example;

public class AppStart {
    protected void finalize(){
    System.out.println("Çöp temizlendi");
    }
    public static void main(String[] args) {
        Data data= new Data();
        Data data1= new Data();
        Data data2= new Data();
        data=null;
        data1=data2;
        System.gc();
    }
}
