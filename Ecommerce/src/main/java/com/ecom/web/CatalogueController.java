package com.ecom.web;

import com.ecom.dao.ProductRepository;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
public class CatalogueController {
    private ProductRepository productRepository;

    public CatalogueController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
