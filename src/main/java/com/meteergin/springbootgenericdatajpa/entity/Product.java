package com.meteergin.springbootgenericdatajpa.entity;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product extends AbstractBaseEntity {

  private String name;
  private String description;

}