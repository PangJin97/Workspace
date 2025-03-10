package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
  private int number;
  private String name;
  private int price;
  private int volume;
  private String  id;

  public OrderDTO(int number, String name, int price, int volume, String id) {
    this.number = number;
    this.name = name;
    this.price = price;
    this.volume = volume;
    this.id = id;
  }

  public OrderDTO(){
  }
}
