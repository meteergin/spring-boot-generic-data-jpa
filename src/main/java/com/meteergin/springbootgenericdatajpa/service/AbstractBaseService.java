package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.AbstractBaseEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface AbstractBaseService<T extends AbstractBaseEntity, ID extends Serializable> {

  T save(T entity);

  T saveAndFlush(T entity);

  List<T> findAll();

  Optional<T> findById(ID entityId);

  T update(T entity);

  T updateById(T entity, ID entityId);

  void delete(T entity);

  void deleteById(ID entityId);

}