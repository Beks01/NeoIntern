package com.example.amazing.Product;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductModel {
    private Long id;
    private String name;
    private int price;

    public ProductModel(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
