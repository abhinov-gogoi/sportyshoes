package com.sportyshoes.ecommerce.repository;

import com.sportyshoes.ecommerce.model.OrderProduct;
import com.sportyshoes.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
