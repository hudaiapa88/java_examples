package com.uc.producer_and_consumer_example.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Message {
    private String title;

    protected static Message create(){
        Message message= new Message();
        message.setTitle("Selam"+new Random().nextInt(100));
        return message;
    }
}
