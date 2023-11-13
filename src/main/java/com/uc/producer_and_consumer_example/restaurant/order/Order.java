package com.uc.producer_and_consumer_example.restaurant.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Order {
    private Long id;
    @Getter
    private Food food;
}
