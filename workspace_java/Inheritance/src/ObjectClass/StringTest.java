package ObjectClass;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "simple";
    String s2 = "Java";

    //concat(): 두 문자열을 나열한 결과를 리턴;
   String s3 = s1.concat(s2);
    System.out.println(s3);

    //length(): 문자열의 길이를 정수로 리턴
    int len = s3.length();

    //String.valueOf 매개변수로 전달된 데이터를 문자열로 바꾸어서 리턴
    String result = String.valueOf(10.5);
    System.out.println(result);

    //substring() : 일부 문자열을 추출할 때 사용
    String data = "Hi java";
    String r1 = data.substring(3);
    System.out.println(r1);

    String r2 = data.substring(1, 4);
    System.out.println(r2);
    //앞에건 포함 뒤에선 전까지

    //split() : 매개변수로 전달된 문자열을 기준으로 문자열을 조각냄
    //조각낸 데이터를 리턴
    String data2 = "a, b, c";

    String[] r3 = data2.split(",");
    System.out.println(r3[0]);
    System.out.println(r3[1]);
    System.out.println(r3[2]);

    //replace()
    String r4 = data2.replace("," , "-");
    //쉼표를 하이폰으로 바꿔준다
    System.out.println(r4);
  }
}
