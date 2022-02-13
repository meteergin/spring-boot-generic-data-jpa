package com.meteergin.springbootgenericdatajpa.repository;

import com.meteergin.springbootgenericdatajpa.entity.Customer;
import com.meteergin.springbootgenericdatajpa.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends AbstractBaseRepository<Order, Long> {

}
