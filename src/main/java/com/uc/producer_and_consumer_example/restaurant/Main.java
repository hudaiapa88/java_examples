package com.uc.producer_and_consumer_example.restaurant;

import com.uc.producer_and_consumer_example.restaurant.chef.Chef;
import com.uc.producer_and_consumer_example.restaurant.customer.CustomerProducer;
import com.uc.producer_and_consumer_example.restaurant.waiter.Waiter;

public class Main {
    public static  void main(String[] args) throws InterruptedException {
      CustomerProducer customerProducer= new CustomerProducer();
      customerProducer.start();
      Waiter waiter= new Waiter("Alperen");
      waiter.start();
      Chef chef=new Chef("Hudai");
      chef.start();
    }
}
