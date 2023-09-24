package com.uc.functional_interface_example;

@FunctionalInterface
public interface ProcessFunction<INPUT,OUTPUT> {
    OUTPUT process(INPUT... input);
}
