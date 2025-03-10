package practice_2;

public class Method_4 {
  public static void main(String[] args) {
    str("izumo", "tenka");

    String b = str("izumo", "tenka");
    System.out.println(b);

  }
  public static String str(String str1, String str2){
    return str1 + str2;
  }
}
