package com.uc.producer_and_consumer_example.restaurant.customer;

import lombok.Getter;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Getter
public class CustomerPool {

    private static CustomerPool INSTANCE;
    private CustomerPool(){}
    public static CustomerPool getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new CustomerPool();
        }
        return INSTANCE;
    }

    private final BlockingQueue<Customer> customers = new LinkedBlockingQueue<>();

    public  void  add(Customer customer) throws InterruptedException {
        if(Optional.ofNullable(customer).isPresent()){
            customers.put(customer);
        }

    }

    public Customer take() throws InterruptedException {
        return customers.take();
    }

}
