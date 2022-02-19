package com.meteergin.springbootgenericdatajpa.service;

import com.meteergin.springbootgenericdatajpa.entity.AbstractBaseEntity;
import com.meteergin.springbootgenericdatajpa.repository.AbstractBaseRepository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public abstract class AbstractBaseRepositoryImp<T extends AbstractBaseEntity, ID extends Serializable>
    implements AbstractBaseService<T, ID> {

  private final AbstractBaseRepository<T, ID> abstractBaseRepository;

  @Override
  public T save(T entity) {
    return abstractBaseRepository.save(entity);
  }

  @Override
  public T saveAndFlush(T entity) {
    return abstractBaseRepository.saveAndFlush(entity);
  }

  @Override
  public List<T> findAll() {
    return abstractBaseRepository.findAll();
  }

  @Override
  public Optional<T> findById(ID entityId) {
    return abstractBaseRepository.findById(entityId);
  }

  @Override
  public T update(T entity) {
    return abstractBaseRepository.save(entity);
  }

  @Override
  public T updateById(T entity, ID entityId) {
    Optional<T> optional = abstractBaseRepository.findById(entityId);
    if (optional.isPresent()) {
      return abstractBaseRepository.save(entity);
    } else {
      return null;
    }
  }

  @Override
  public void delete(T entity) {
    abstractBaseRepository.delete(entity);
  }

  @Override
  public void deleteById(ID entityId) {
    abstractBaseRepository.deleteById(entityId);
  }

}
