package com.uc.producer_and_consumer_example;

import com.sun.source.tree.WhileLoopTree;
import jakarta.inject.Inject;
import jakarta.inject.Scope;

import javax.swing.plaf.TableHeaderUI;

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
