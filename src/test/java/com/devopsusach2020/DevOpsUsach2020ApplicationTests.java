package com.devopsusach2020;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")

class DevOpsUsach2020ApplicationTests {

  @Value("${1}")
  Integer numberOne;
  @Test
  void test(){
    assertEquals(numberOne, 1);
  }
}
