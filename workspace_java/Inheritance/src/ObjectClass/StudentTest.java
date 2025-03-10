package ObjectClass;

public class StudentTest {
  public static void main(String[] args) {

    int[] arr1 ={1,2,3};
    int[] arr2 = arr1;

    arr2[0] = 5;
    System.out.println(arr1[0]); //5
    System.out.println(arr2[0]); //5

    //immutable
    String a = "Java";
    String b = a;
    b= "python";

    System.out.println(a); //java
    System.out.println(b); //python


    //String 데이터는 메모리 공간 낭비를 최소화 할 수 있도록 설계
    //그래서 데이터('react')는 다른곳에 있고 데이터가 있는 주소값을 할당, 참조한다
    String str1 = "react";
    String str2 = "react";

    String str3 = new String("java");
    String str4 = new String("java");
    // new => 새로운 객체를 만든다.

    //둘다 java 를 출력하지만
    //=> 차이점이 존재함

    // == 두 객체가 주소값이 같은지 비교하는 연산
    // 숫자 비교 연산에서도 추가적으로 사용하도록 허용해준 것

    if(str1 == str2){
      System.out.println("str1과 str2는 같습니다");
    }

    if(str3 == str4){
      System.out.println("str1과 str2는 같습니다");
    }
    //실행 안됨


 /// //////////////////////////////////////////
    Student s1 = new Student(2,"박자바");
    Student s2 = new Student(2,"박자바");

    //s1객체와 s2객체가 같은 객체입니까? => return boolean 값
    System.out.println(s1.equals(s2));
  }
}
