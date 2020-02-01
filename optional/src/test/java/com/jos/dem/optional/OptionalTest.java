package com.jos.dem.optonal;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.logging.Logger;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalTest {

  private static final Logger log = Logger.getLogger(OptionalTest.class.getName());

  @Test
  @DisplayName("should validate if is present")
  void shouldBePresent(){
    Optional<String> opt = Optional.ofNullable("josdem");
    assertTrue(opt.isPresent(), "should be present");
  }

  @Test
  @DisplayName("should validate when is not present")
  void shouldNotBePresent() {
    Optional<String> opt = Optional.ofNullable(null);
    assertFalse(opt.isPresent(), "should not be present");
  }

  @Test
  @DisplayName("should take action if is present")
  void shouldPrintValue(){
    Optional<String> opt = Optional.ofNullable("josdem");
    opt.ifPresent(value -> log.info("value: " + opt.get()));
  }

}