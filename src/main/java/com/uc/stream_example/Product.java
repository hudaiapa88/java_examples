package com.uc.stream_example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;

    private static Product getDemo(){
        Random random= new Random();
        Product product= new Product();
        product.setId(random.nextLong(1,100000000000000l));
        product.setName("ÜRÜN"+ random.nextInt());
        product.setPrice(new BigDecimal(random.nextDouble(1,10000)));
        return product;
    }
    public static List<Product> getDemoList(){
        return Arrays.asList(getDemo(),getDemo(),getDemo(),getDemo(),getDemo(),getDemo());
    }

}
