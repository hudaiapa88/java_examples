package com.uc.producer_and_consumer_example;

import jakarta.inject.Inject;

public class Producer implements Runnable{

    @Override
    public void run() {
        try {
            for (int i=0;i<30;i++){
               Thread.sleep(500);
                DataQueue.add(Message.create());
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


}
