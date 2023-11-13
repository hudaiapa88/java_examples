package com.uc.producer_and_consumer_example.restaurant.order;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OrderQueue {
    private final static BlockingQueue<Order> waitingOrders = new LinkedBlockingQueue<>();

    public static void  add(Order order) throws InterruptedException {
        if(Optional.ofNullable(order).isPresent()){
            waitingOrders.put(order);
        }

    }

    public static Order take() throws InterruptedException {
        return waitingOrders.take();
    }
}
