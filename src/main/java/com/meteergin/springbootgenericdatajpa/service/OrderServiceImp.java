package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.Order;
import com.meteergin.springbootgenericdatajpa.repository.OrderRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderServiceImp extends AbstractBaseRepositoryImp<Order, Long>
    implements OrderService {

  private OrderRepository orderRepository;

  public OrderServiceImp(OrderRepository orderRepository) {
    super(orderRepository);
  }

}