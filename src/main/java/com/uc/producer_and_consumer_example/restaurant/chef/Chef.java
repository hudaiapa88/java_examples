package com.uc.producer_and_consumer_example.restaurant.chef;

import com.uc.producer_and_consumer_example.restaurant.order.Order;
import com.uc.producer_and_consumer_example.restaurant.order.OrderQueue;

public class Chef extends Thread {
    private String name;
    public Chef(String name) {
        this.name = name;
    }
    private Order order;
    @Override
    public  void run() {
        try {
            while (true){
                this.order= OrderQueue.take();
                Thread.sleep(order.getFood().getPreparationDuration().toMillis());
                System.out.println(this.order.getFood().getTitle() +" hazırlandı");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
