package com.uc.producer_and_consumer_example.restaurant.order;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class Food {
    String title;

    Duration preparationDuration;
    public Food(String title, Duration preparationDuration){
        this.title= title;
        this.preparationDuration=preparationDuration;
    }
}
