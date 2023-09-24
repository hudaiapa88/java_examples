package com.uc.properties_management;

import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;

public class Main {
    public static void main(String[] args) {

        Properties properties = ConfigCache.getOrCreate(Properties.class);
        System.out.println(properties.opencvModelResultLimit());
    }
}
