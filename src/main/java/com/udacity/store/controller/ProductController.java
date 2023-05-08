package com.udacity.store.controller;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:4200")


public class ProductController {
// TODO: Use the mapping products to add an API endpoint to fetch the products from the ProductRepository


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("product/{Id}")
    public Product getProduct(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @GetMapping("products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }


}
