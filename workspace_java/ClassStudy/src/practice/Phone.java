package practice;

public class Phone {
  String brand;
  String model;
  String color;
  int price;
  String tel;

  //setter => set + 변수명

  public void setName(String name1){
    brand = name1;
  }

  public void setModel(String model1){
    model = model1;
  }

  public void setColor(String color1){
    color = color1;
  }

  public void setPrice(int price1){
    price = price1;
  }

  public void setPhoneNumber(String phoneNumber1){
    tel = phoneNumber1;
  }

  public void printAll(){
    System.out.println("제조사 : " + brand);
    System.out.println("모델명 : " + model);
    System.out.println("색상 : " + color);
    System.out.println("가격 : " + price);
    System.out.println("휴대폰번호 : " + tel);
  }
}
