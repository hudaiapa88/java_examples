package com.uc.producer_and_consumer_example.restaurant.waiter;

import com.uc.producer_and_consumer_example.restaurant.customer.Customer;
import com.uc.producer_and_consumer_example.restaurant.customer.CustomerPool;
import com.uc.producer_and_consumer_example.restaurant.order.Order;
import com.uc.producer_and_consumer_example.restaurant.order.OrderQueue;

import java.time.Duration;

public class Waiter extends Thread{
    private String name;
    private Duration takeDuration=Duration.ofMillis(1000);
    public Waiter(String name){
        this.name=name;
    }

    private Order order;

    private CustomerPool customerPool=CustomerPool.getInstance();

    @Override
    public  void  run() {
        try {
            while (true){
                Thread.sleep(takeDuration.toMillis());
                Customer customer= customerPool.take();
                this.order=customer.getOrder();
                OrderQueue.add(this.order);
                System.out.println(this.order.getFood().getTitle() +" siparişi alındı");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
