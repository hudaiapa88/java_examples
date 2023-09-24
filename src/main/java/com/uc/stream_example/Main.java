package com.uc.stream_example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Product.getDemoList();
        products.stream().forEach(product -> {
            System.out.println(product.toString());
        });
        System.out.println("---------------------------------------");
        products.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");
        List<Long> Ids = products.stream().map(Product::getId).collect(Collectors.toList());
        Ids.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("Reduce Sum : " + Ids.stream().reduce(0L, Long::sum));
        System.out.println("---------------------------------------");
        BigDecimal t = products.stream().reduce(new BigDecimal(0), (total, product) -> total.add(product.getPrice()), BigDecimal::add);
        System.out.println("Product price sum : " + t);
        System.out.println("---------------------------------");
        List<Product> products1 = products.stream().dropWhile(product -> product.getPrice().intValue() % 2 != 0).collect(Collectors.toList());
        products1.stream().sequential().forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("Max price :"+products.stream().max(Comparator.comparing(product -> product.getPrice())).get().getPrice()) ;
        System.out.println("Min price :"+products.stream().min(Comparator.comparing(product -> product.getPrice())).get().getPrice()) ;
        System.out.println("---------------------------------------");
    }
}
