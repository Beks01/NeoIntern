package com.example.amazing.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
        return (List<Products>) productsRepository.findAll();
    }

    public Products findById(Long id) throws Exception {
        return productsRepository.findById(id).orElseThrow(Exception::new);
    }

    public String deleteById(Long id) {
        productsRepository.deleteById(id);
        return id + " was successfully deleted!";
    }

    public Products createProducts(Products products) {
        Products products1 = new Products(1L, products.getName(), products.getPrice());

        return productsRepository.save(products1);
    }

    public Products updateProductsById(Long id, Products productsModel) {
        Optional<Products> customers = productsRepository.findById(id);
        if (customers.isPresent()) {
            Products updatedProducts = customers.get();

            updatedProducts.setName(productsModel.getName());
            updatedProducts.setPrice(productsModel.getPrice());

            productsRepository.save(updatedProducts);
        }


        return productsModel;
    }



}
