package com.sportyshoes.ecommerce.repository;

import com.sportyshoes.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
