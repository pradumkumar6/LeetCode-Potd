import java.util.*;

public class reverseString {
  public static void reverse(char s[]) {
    int start = 0;
    int end = s.length - 1;
    while (start < end) {
      char temp = s[end];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }

  }

}
