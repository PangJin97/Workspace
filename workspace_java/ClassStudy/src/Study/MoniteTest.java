package Study;

public class MoniteTest {
  public static void main(String[] args) {
    Moniter m1 = new Moniter();
    //매개변수가 없는 생성자. - > 기본생성자의 호출,
    //다른 생성자 하나라도 있으면
    //기본생성자가 자동으로 만들어지지 않는다.
    //주의 요망


    Moniter m2 = new Moniter("Java");
    //생성자가 매개변수를 통해 데이터를 받아 초기화 가능

    m1.printInfo();

    System.out.println();

    m2.printInfo();

    System.out.println();

    Moniter m3 = new Moniter("LG","Black");
    m3.printInfo();





  }
}
