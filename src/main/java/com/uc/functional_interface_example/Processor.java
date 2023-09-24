package com.uc.functional_interface_example;

public class  Processor {
    Integer process(ProcessFunction processFunction){
        return (Integer) processFunction.process();
    }
}
