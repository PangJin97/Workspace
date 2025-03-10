package 접근제한자2;

import 접근제한자1.Orange;

public class OrangeTest2 {
  public static void main(String[] args) {
    Orange orange = new Orange();

   // orange.a; private
   // orange.b; default
    orange.c = 10 ; // public은 가능.

  }

}
