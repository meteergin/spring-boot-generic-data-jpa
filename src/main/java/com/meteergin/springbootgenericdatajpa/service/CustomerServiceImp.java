package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.Customer;
import com.meteergin.springbootgenericdatajpa.repository.CustomerRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerServiceImp extends AbstractBaseRepositoryImp<Customer, Long>
    implements CustomerService {

  private CustomerRepository customerRepository;

  public CustomerServiceImp(CustomerRepository customerRepository) {
    super(customerRepository);
  }

}