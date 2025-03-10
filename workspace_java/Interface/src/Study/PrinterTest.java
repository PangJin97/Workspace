package Study;

public class PrinterTest {
  public static void main(String[] args) {
    SamsungPrinter p = new SamsungPrinter();
    p.print();
    p.colorPrint();

    //인터페이스에서의 객체생성
    Print p2 = new SamsungPrinter();

    //인터페이스 자료형
    //p2의 실체는 삼성프린터 -> 인터페이스는 아님
    //인터페이스는 그냥 인증마크

    //왜 이렇게 복잡하게?
    //다형성의 장점

  }
}
