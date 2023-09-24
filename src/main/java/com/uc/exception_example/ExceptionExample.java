package com.uc.exception_example;

public  class ExceptionExample {
    public static void main(String[] args) {
        try {
            int data=25/0;
            System.out.println(data);
        }catch (RuntimeException e){
            System.out.println("Run time Exception");
        }finally {
            int data =25/0;
            System.out.println("Artimetic exception");
        }
    }

}
