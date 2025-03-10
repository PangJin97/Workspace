package com.green.First;

public class Order {
  private int number;
  private String name;
  private int price;
  private int volume;
  private int id;

  public Order(int number, String name, int price, int volume, int id) {
    this.number = number;
    this.name = name;
    this.price = price;
    this.volume = volume;
    this.id = id;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

