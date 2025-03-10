package 접근제한자1;

public class OrangeTest1 {
  public static void main(String[] args) {
    Orange orange = new Orange();
    //orange.a; -> a변수는 private라서 다른 클래스에서 접근 불가.
    //orange.aaa();

    orange.b = 10; //오렌지 오렌지테스트1은 같은 패키지라서 사용가능
    orange.c = 20; //프로젝트안에만 있어도 접근 가능.

    //멤버변수가 private 가 붙어서 setter, getter 로 우회한다.
    orange.setPrice(100);
  }
}
