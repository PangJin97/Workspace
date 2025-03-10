package Study;

import java.util.Arrays;

//클래스 자료형을 배열로 활용하기
public class SmartPhoneTest {
  public static void main(String[] args) {
    //스마트폰 5개를 저장할 수 있는 배열 phones 를 생성
    //자료형[] 배열명 = new 자료형[갯수]
    SmartPhone[] phonesArr = new SmartPhone[5];

    //스마트폰 객체 생성

    SmartPhone p1 = new SmartPhone("s1",10000,12.5);
    SmartPhone p2 = new SmartPhone("s2",30000,13.5);
    SmartPhone p3 = new SmartPhone("s3",50000,17.5);
    SmartPhone p4 = new SmartPhone("s4",20000,19.5);
    SmartPhone p5 = new SmartPhone("s5",70000,15.5);

    //폰 객체를 배열에 저장
    phonesArr[0] = p1;
    phonesArr[1] = p2;
    phonesArr[2] = p3;
    phonesArr[3] = p4;
    phonesArr[4] = p5;

    //phoneArr 배열에 저장된 모든 폰의 모델명, 가격, 크기를 출력
    /*
    for(int i = 0; i < phonesArr.length; i++){
      phonesArr[i].printInfo();
    }
    */

    //phoneArr 배열에서 0번째에 저장된 폰의 가격 출력
    //System.out.println(phonesArr[0].getPrice());


    //phoneArr 배열에서 크기가 13inch 이상인 폰의 모델명을 모두 출력
    /*
    for(int i= 0; i < phonesArr.length; i ++){
      if(phonesArr[i].getInch() > 13){
        System.out.println(phonesArr[i].getModelName());
      }
    }
    */
   //for each 로 풀기
    for( SmartPhone e : phonesArr){
      if(e.getInch() > 13){
        System.out.println(e.getModelName());
      }
    }

  }
}
