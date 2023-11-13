package com.uc.producer_and_consumer_example.restaurant.customer;

import com.uc.producer_and_consumer_example.restaurant.order.Food;
import com.uc.producer_and_consumer_example.restaurant.order.Order;

import java.time.Duration;

public class CustomerProducer extends Thread{

    private final CustomerPool customerPool = CustomerPool.getInstance();
    private void produce() throws InterruptedException {
        Food pizza=new Food("Pizza", Duration.ofMillis(2000));
        Order orderPizza=new Order(1L,pizza);
        Food kebab= new Food("Kebab",Duration.ofMillis(1000));
        Order orderKebab=new Order(1L,kebab);
        Customer customer= new Customer("m1",orderKebab);
        Customer customer1= new Customer("m2",orderPizza);
        customerPool.add(customer);
        customerPool.add(customer1);
    }

    @Override
    public void run(){
        try {
            this.produce();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
