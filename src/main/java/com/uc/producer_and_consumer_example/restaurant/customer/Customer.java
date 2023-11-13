package com.uc.producer_and_consumer_example.restaurant.customer;

import com.uc.producer_and_consumer_example.restaurant.order.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String deskId;
    private Order order;
}
