package com.meteergin.springbootgenericdatajpa.repository;

import com.meteergin.springbootgenericdatajpa.entity.Customer;
import com.meteergin.springbootgenericdatajpa.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends AbstractBaseRepository<Product, Long> {

}
