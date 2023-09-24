package com.uc.class_example.inner_class_example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tea {
     private String title;
     private Double price;
     private Category category;
     protected static Tea create(String title,Double price,Category category){
       Tea tea= new Tea();
       tea.setTitle(title);
       tea.setPrice(price);
       tea.category= category;
       return tea;
     }

     @Getter
     @Setter
     @ToString
    static class Category{
        private String title;
        protected static Category create(String title){
            Category category= new Category();

            category.title=title;
            return category;
        }
    }
}
