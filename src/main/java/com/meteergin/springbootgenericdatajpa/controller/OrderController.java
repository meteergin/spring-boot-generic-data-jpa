package com.meteergin.springbootgenericdatajpa.controller;

import com.meteergin.springbootgenericdatajpa.entity.Order;
import com.meteergin.springbootgenericdatajpa.service.OrderService;
import java.util.List;
import lombok.AllArgsConstructor;
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

  @GetMapping("/all")
  public List<Order> findAll() {
    return orderService.findAll();
  }

  @PostMapping
  public Order create(@RequestBody Order order) {
    return orderService.save(order);
  }

}