package com.uc.producer_and_consumer_example;

import jakarta.inject.Scope;
import lombok.extern.slf4j.Slf4j;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;


public class DataQueue {
    private final static BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

    public static void  add(Message message) throws InterruptedException {
        queue.put(message);
    }

    public static Message take() throws InterruptedException {
        return queue.take();
    }
    public static void queuesPrint(){
        System.out.println("---------------------QUEUE-------------------------");
        queue.stream().forEach((message)-> System.out.println(message.getTitle()));
        System.out.println();
    }
}
