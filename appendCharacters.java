public class appendCharacters {
  public static int appendChar(String s, String t) {
    int i = 0;
    int j = 0;
    while (i < s.length() && j < t.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        i++;
        j++;
      } else {
        i++;
      }
    }
    return t.length() - j; // this remaining characters to be appended at the end of String s
  }

}
