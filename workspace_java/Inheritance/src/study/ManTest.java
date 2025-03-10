package study;

public class ManTest {
  public static void main(String[] args) {
    //BusinessMan 클래스에 대한 객체 생성

    BusinessMan man = new BusinessMan("LG");
    man.company = "SAMSUNG";
    man.tellName();
    man.tellCompany();
  }
}
