package com.meteergin.springbootgenericdatajpa.controller;

import com.meteergin.springbootgenericdatajpa.entity.CustomerOrder;
import com.meteergin.springbootgenericdatajpa.service.OrderService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/v1/order")
@AllArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @GetMapping
  public ResponseEntity<List<CustomerOrder>> findAll() {
    return new ResponseEntity<>(orderService.findAll(),
        HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<CustomerOrder> create(@RequestBody CustomerOrder order) {
    return new ResponseEntity<>(orderService.save(order), HttpStatus.CREATED);
  }

}