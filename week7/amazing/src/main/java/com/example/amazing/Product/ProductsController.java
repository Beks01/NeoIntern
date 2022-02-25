package com.example.amazing.Product;


import com.example.amazing.Product.Products;
import com.example.amazing.Product.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("/{id}")
    public Products getProducts(@PathVariable("id") Integer id) throws Exception {
        return productsService.findById(id);
    }

    @GetMapping(value = "/all")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Products putProducts(@PathVariable("id") Integer id, @RequestBody Products products) throws Exception {
        return productsService.updateProductsById(id, products);
    }

    @PostMapping("/add")
    public Products addProducts(@RequestBody Products products) {
        productsService.createProducts(products);
        return products;

    }

    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable("id") Integer id) {
        productsService.deleteById(id);
    }

}
