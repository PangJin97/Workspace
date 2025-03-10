package practice;

import java.util.Arrays;

public class Song {
  String title;
  String artist;
  String album;
  int year;
  String[] composer;

  public void initSong(String title, String artist, String album, int year, String[] composer){
   this.title = title;
   this.artist = artist;
   this.album = album;
   this.year = year;
   this.composer = composer;
  }

  public void printSong(){
    System.out.println("노래제목: " + title);
    System.out.println("가수: " + artist);
    System.out.println("앨범제목: " + album);
    System.out.println("연도: " + year);
    System.out.println("작곡가: " + Arrays.toString(composer));
  }
}

