package com.green.First;

public class DataDTO {
  private String food;
  private int bowls;
  private String toping;
  private String extraNeed;
  private String days;

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getBowls() {
    return bowls;
  }

  public void setBowls(int bowls) {
    this.bowls = bowls;
  }

  public String getToping() {
    return toping;
  }

  public void setToping(String toping) {
    this.toping = toping;
  }

  public String getExtraNeed() {
    return extraNeed;
  }

  public void setExtraNeed(String extraNeed) {
    this.extraNeed = extraNeed;
  }

  public String getDays() {
    return days;
  }

  public void setDays(String days) {
    this.days = days;
  }

  @Override
  public String toString() {
    return "DataDTO{" +
            "food='" + food + '\'' +
            ", bowls=" + bowls +
            ", toping='" + toping + '\'' +
            ", extraNeed='" + extraNeed + '\'' +
            ", days='" + days + '\'' +
            '}';
  }
}

