package com.sportyshoes.ecommerce.repository;

import com.sportyshoes.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
