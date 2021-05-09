package com.sportyshoes.ecommerce.controller;

import com.sportyshoes.ecommerce.model.Order;
import com.sportyshoes.ecommerce.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/all-orders")
public class OrderController2 {

    private final OrderRepository orderRepository;
    public OrderController2(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @NotNull Iterable<Order> list() {
        return this.orderRepository.findAll();
    }

}
