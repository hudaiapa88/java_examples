package com.uc.for_loop_example;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= IntStream.range(1,10).boxed().collect(Collectors.toList());
        for (Iterator<Integer> i=list.iterator();i.hasNext();){
            System.out.println(i.next());
        }

    }
}
