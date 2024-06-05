import java.util.*;

public class findCommonCharacters {
  public void fillCountArray(String word, int count[]) {
    for (char ch : word.toCharArray()) {
      count[ch - 'a']++;
    }
  }

  public List<String> commonChars(String[] words) {
    List<String> res = new ArrayList<>();
    int count[] = new int[26];
    fillCountArray(words[0], count);
    for (int i = 1; i < words.length; i++) {
      int temp[] = new int[26];
      fillCountArray(words[i], temp);
      for (int j = 0; j < 26; j++) {
        count[j] = Math.min(count[j], temp[j]);
      }
    }
    // Collect the common characters based on the count array
    for (int i = 0; i < 26; i++) {
      if (count[i] > 0) {
        for (int j = 0; j < count[i]; j++) {
          res.add(String.valueOf((char) (i + 'a')));
        }
      }
    }
    return res;
  }
}
