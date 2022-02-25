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

    public Products findById(int id) throws Exception {
        return productsRepository.findById(id).orElseThrow(Exception::new);
    }

    public void deleteById(int id) {
        productsRepository.deleteById(id);
    }

    public void createProducts(Products products) {
        Products products1 = new Products(1, products.getName(), products.getPrice());

        productsRepository.save(products1);
    }

    public Products updateProductsById(Integer id, Products productsModel) {
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
