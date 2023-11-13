package com.uc.producer_and_consumer_example.example;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.environment.se.events.ContainerInitialized;

public class AppStart {
    @Inject
    Producer producer;
    @Inject
    Consumer consumer;
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
    }
    public void start(@Observes ContainerInitialized event) {
        System.out.println("Initialized");
        Thread tConsumer= new Thread(consumer);
        Thread tProducer= new Thread(producer);
        tConsumer.start();
        tProducer.start();


    }
}
