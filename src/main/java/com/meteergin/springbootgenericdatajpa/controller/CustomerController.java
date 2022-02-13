package com.meteergin.springbootgenericdatajpa.controller;

import com.meteergin.springbootgenericdatajpa.entity.Customer;
import com.meteergin.springbootgenericdatajpa.exception.CustomerNotFoundException;
import com.meteergin.springbootgenericdatajpa.service.CustomerService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/v1/customer")
@AllArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("/all")
  public ResponseEntity<List<Customer>> findAll() {
    List<Customer> customerList = customerService.findAll();
    return new ResponseEntity<>(customerList,
        HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> findById(@PathVariable Long id) {
    Optional<Customer> customer = customerService.findById(id);
    if (customer.isPresent()) {
      return new ResponseEntity<>(customer.get(),
          HttpStatus.OK);
    } else {
      throw new CustomerNotFoundException(id);
    }
  }

  @PostMapping
  public Customer create(@RequestBody Customer customer) {
    return customerService.save(customer);
  }

}