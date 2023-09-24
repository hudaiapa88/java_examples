package com.uc.for_example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Boolean> booleans = new LinkedBlockingQueue<>();
        booleans.put(Boolean.TRUE);
        booleans.put(Boolean.TRUE);
        booleans.put(Boolean.FALSE);
        booleans.put(Boolean.FALSE);
        booleans.put(Boolean.FALSE);
        booleans.put(Boolean.FALSE);
        booleans.put(Boolean.FALSE);
        booleans.put(Boolean.FALSE);

        for (int i = 0; i < 3; i++) {
            System.out.println("---------Boolean----------");
            if (booleans.take()) {
                for (int j = 0; j < (3 - i); j++) {
                    System.out.println("-------Queue Arrays---------");
                    booleans.stream().forEach(System.out::println);
                    booleans.take();

                }
            }
        }
    }
}
