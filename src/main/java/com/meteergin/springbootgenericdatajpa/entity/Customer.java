package com.meteergin.springbootgenericdatajpa.entity;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Customer extends AbstractBaseEntity {

  private String name;

}