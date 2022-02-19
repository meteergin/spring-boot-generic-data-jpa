package com.meteergin.springbootgenericdatajpa.repository;

import com.meteergin.springbootgenericdatajpa.entity.CustomerOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends AbstractBaseRepository<CustomerOrder, Long> {

}
