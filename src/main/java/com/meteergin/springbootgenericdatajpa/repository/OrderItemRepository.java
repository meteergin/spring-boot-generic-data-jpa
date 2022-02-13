package com.meteergin.springbootgenericdatajpa.repository;

import com.meteergin.springbootgenericdatajpa.entity.Customer;
import com.meteergin.springbootgenericdatajpa.entity.OrderItem;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends AbstractBaseRepository<OrderItem, Long> {

}
