import java.util.*;

public class scoreOfString {
  public static int calcScore(String s) {
    int score = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      score += Math.abs(s.charAt(i) - s.charAt(i + 1));
    }
    return score;
  }

  public static void main(String args[]) {
    String s = "zaz";
    System.out.println(calcScore(s));

  }
}