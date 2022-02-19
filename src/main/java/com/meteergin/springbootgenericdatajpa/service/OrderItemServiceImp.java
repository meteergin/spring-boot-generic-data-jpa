package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.OrderItem;
import com.meteergin.springbootgenericdatajpa.repository.OrderItemRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderItemServiceImp extends AbstractBaseRepositoryImp<OrderItem, Long>
    implements OrderItemService {

  private OrderItemRepository orderItemRepository;

  public OrderItemServiceImp(OrderItemRepository orderItemRepository) {
    super(orderItemRepository);
  }

}