package com.uc.producer_and_consumer_example.example;

public class Consumer implements Runnable {


    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(1000);
                System.out.println("Data take");
                System.out.println(DataQueue.take().getTitle());
                DataQueue.queuesPrint();
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
