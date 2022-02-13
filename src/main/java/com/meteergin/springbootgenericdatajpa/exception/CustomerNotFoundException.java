package com.meteergin.springbootgenericdatajpa.exception;

public class CustomerNotFoundException extends RuntimeException {

  public CustomerNotFoundException() {
    super("Could not find customer.");
  }

  public CustomerNotFoundException(Long id) {
    super("Could not find customer " + id + ".");
  }
}