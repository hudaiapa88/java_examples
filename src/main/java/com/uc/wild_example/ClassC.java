package com.uc.wild_example;

import jakarta.inject.Inject;

public class ClassC {
    @Inject
    private ClassA classA;

    public void hello(){
        classA.hello();
    }
}
