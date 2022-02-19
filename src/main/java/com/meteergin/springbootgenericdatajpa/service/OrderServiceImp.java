package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.CustomerOrder;
import com.meteergin.springbootgenericdatajpa.repository.OrderRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderServiceImp extends AbstractBaseRepositoryImp<CustomerOrder, Long>
    implements OrderService {

  private OrderRepository orderRepository;

  public OrderServiceImp(OrderRepository orderRepository) {
    super(orderRepository);
  }

}