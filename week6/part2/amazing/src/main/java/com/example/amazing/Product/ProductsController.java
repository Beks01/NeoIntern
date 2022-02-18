package com.example.amazing.Product;


import com.example.amazing.Product.Products;
import com.example.amazing.Product.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("/{id}")
    public Products getProducts(@PathVariable("id") Long id) throws Exception {
        return productsService.findById(id);
    }

    @GetMapping(value = "/all")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Products putProducts(@PathVariable("id") Long id, @RequestBody Products products) throws Exception {
        return productsService.updateProductsById(id, products);
    }

    @PostMapping("/add")
    public Products addCustomers(@RequestBody Products customers) {
        productsService.createProducts(customers);
        return customers;

    }

    @DeleteMapping("/{id}")
    public void deleteCustomers(@PathVariable("id") Long id) {
        productsService.deleteById(id);
    }

}
