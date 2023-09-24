package com.uc.comparable_example;

public class Product implements Comparable<Product> {
    private Long id;

    @Override
    public int compareTo(Product o) {
      /*  if (id < o.id) {
            return -1;
        } else if (id == o.id) {
            return 0;
        } else {
            return 1;
        }*/
        return id.compareTo(o.id);
    }
}
