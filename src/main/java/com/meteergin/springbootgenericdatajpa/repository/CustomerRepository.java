package com.meteergin.springbootgenericdatajpa.repository;

import com.meteergin.springbootgenericdatajpa.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends AbstractBaseRepository<Customer, Long> {

}
