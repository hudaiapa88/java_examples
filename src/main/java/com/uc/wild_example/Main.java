package com.uc.wild_example;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import java.util.stream.Collectors;

public class Main {
    @Inject
    private ClassC classC;

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
       // System.out.println(container.stream().count());
    }

    public void start(@Observes ContainerInitialized event) {
        classC.hello();
        System.out.println("Initialized");
    }
}
