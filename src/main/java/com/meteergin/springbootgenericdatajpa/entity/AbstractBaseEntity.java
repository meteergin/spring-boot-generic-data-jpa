package com.meteergin.springbootgenericdatajpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.Data;

@MappedSuperclass
@Data
public class AbstractBaseEntity implements Serializable {

  @Id
  @GeneratedValue
  private Long id;
  @Version
  private int version;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public AbstractBaseEntity() {
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
  }

}