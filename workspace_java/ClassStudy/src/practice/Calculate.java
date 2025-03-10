package practice;

public class Calculate {

  private int a;
  private int b;

  //생성자는 주로 멤버변수 뒤에 작성

  public Calculate(int a, int b){
    this.a = a;
    this.b = b;
  }

  public void setA(int a){
    this.a = a;
  }

  public void setB(int b){
    this.b = b;
  }


  //더한 결과를 리턴하는 기능
  public int getSum(){
    return a + b;
  }


  //빼기 기능
  public int getSub(){
    return a - b;
  }

  //곱하기 기능
  public int getMulti(){
    return a * b;
  }

  //나누기 기능
  public double getDiv(){
    return a / (double)b;
  }
  //둘중하나는 실수로



}
