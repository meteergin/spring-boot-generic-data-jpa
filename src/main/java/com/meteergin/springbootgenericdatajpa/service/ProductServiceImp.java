package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.Order;
import com.meteergin.springbootgenericdatajpa.entity.Product;
import com.meteergin.springbootgenericdatajpa.repository.OrderRepository;
import com.meteergin.springbootgenericdatajpa.repository.ProductRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImp extends AbstractBaseRepositoryImp<Product, Long>
    implements ProductService {

  private ProductRepository productRepository;

  public ProductServiceImp(ProductRepository productRepository) {
    super(productRepository);
  }

}