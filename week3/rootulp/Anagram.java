import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

  public static boolean isAnagram(String baseWord, String otherWord) {
    return sort(baseWord).equals(sort(otherWord));
  }

  private static String sort(String word) {
    char[] chars = canonicalize(word);
    Arrays.sort(chars);
    return new String(chars);
  }

  private static char[] canonicalize(String word) {
    return word.toLowerCase().toCharArray();
  }

  public static void main(String args[]) {
    if (args.length < 1) {
      System.out.println("Please input base word");
      System.exit(0);
    }

    String baseWord = args[0];
    List<String> anagrams = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String currentWord = scanner.next().toLowerCase();
      if (Anagram.isAnagram(baseWord, currentWord)) {
        anagrams.add(currentWord);
      }
    }

    System.out.println(anagrams);
  }
}
