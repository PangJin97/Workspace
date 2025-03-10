package Study;

import javax.crypto.interfaces.PBEKey;

public class Moniter {
  String brand;
  String color;
  double inch;

  //default 생성자(기본 생성자)
 public Moniter(){
   brand = "삼성";
  }

  //생성자는 오버로딩 개념을 통해
  //여러개 생성가능
  public Moniter(String brand){
    this.brand = brand;
  }

  public Moniter(String brand, String color){
   this.brand = brand;
   this.color = color;
   this.inch =24.0;
   //매개변수로 받을 수 있고 상수로 받을 수 있다.
  }

  public void printInfo(){
    System.out.println("브랜드 : " + brand);
    System.out.println("색상 : " + color);
    System.out.println("인치 : " + inch);

  }


}
