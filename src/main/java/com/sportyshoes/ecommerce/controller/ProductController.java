package com.sportyshoes.ecommerce.controller;

import com.sportyshoes.ecommerce.model.Product;
import com.sportyshoes.ecommerce.model.User;
import com.sportyshoes.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping(value = { "", "/" })
    void addProduct(@RequestBody Product product) {
        productService.save(product);
    }
}
