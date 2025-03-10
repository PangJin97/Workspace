package com.green.Second;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
//I0C : 제어의 역전
@Getter
@Setter
@ToString
public class Phone {
  private String modelName;
  private int price;
}
