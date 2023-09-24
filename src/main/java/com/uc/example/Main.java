package com.uc.example;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);
        StringBuilder word1 = new StringBuilder(sc.next()) ;
        StringBuilder word2 = new StringBuilder(sc.next()) ;
        Boolean status=Boolean.FALSE;
        for (int i = 0; i < word1.length(); i++) {
            status=Boolean.FALSE;

            for (int j = 0; j < word2.length(); j++) {
                if(word1.charAt(i)==word2.charAt(j)){
                    status=Boolean.TRUE;
                   word1= word1.deleteCharAt(i);
                   i=0;
                   word2= word2.deleteCharAt(j);
                   System.out.println(word1+"  "+word2);
                   break;

                }
            }

            if(status==Boolean.FALSE){
                System.out.println("Anagram değil");
                break;
            }

        }
        if(status==Boolean.TRUE){
            System.out.println("Anagram");
        }*/
        Scanner sc = new Scanner(System.in);
        StringBuilder word1 = new StringBuilder(sc.next().toLowerCase(Locale.ROOT));
        StringBuilder word2 = new StringBuilder(sc.next().toLowerCase(Locale.ROOT));
        if(getPrimeMultip(word1)==getPrimeMultip(word2)){
            System.out.println("Anagramdır");
        }
        else {
            System.out.println("Anagram değildir");
        }

    }

    static int getPrimeMultip(StringBuilder word) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] primeNumbers = generatePrimeNumbers(26);
        int result=1;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j]) {
                    result*=primeNumbers[j];
                }
            }
        }
        return result;
    }


    static int[] generatePrimeNumbers(int count) {
        int[] primes = new int[count];
        int num = 2;
        int found = 0;

        while (found < count) {
            if (isPrime(num)) {
                primes[found] = num;
                found++;
            }
            num++;
        }
        return primes;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
