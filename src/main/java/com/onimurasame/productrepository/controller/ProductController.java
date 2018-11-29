package com.onimurasame.productrepository.controller;

import com.onimurasame.productrepository.data.Product;
import com.onimurasame.productrepository.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@Slf4j
class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    ResponseEntity<String> setProduct(Product product) {

        productRepository.save(product);

        log.info("Now " + productRepository.count() + " products");

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

}
