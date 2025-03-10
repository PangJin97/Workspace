package practice;

public class SongTest {
  public static void main(String[] args) {
    Song song1 = new Song();
    String[] composer = {"김자바", "이자바","박자바"};
    song1.initSong("java","김자바","1집",2025, composer);
    song1.printSong();

    //기본 자료형을 제외한 모든 자료형은 기본 초기값 : null
  }
}
