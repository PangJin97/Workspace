package practice;

public class PhoneTest {
  public static void main(String[] args) {
    Phone phone1 = new Phone();

    phone1.setName("삼성");
    phone1.setModel("Galaxy3");
    phone1.setColor("Blue");
    phone1.setPrice(800000);
    phone1.setPhoneNumber("010-3222-3333");

    phone1.printAll();
  }

}
