import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

// Running this solution:
// 1. javac Anagram.java
// 2. java Anagram demo < ../wordsEn.txt

public class Anagram {

  public static boolean isAnagram(String baseWord, String otherWord) {
    return Arrays.equals(sortChars(baseWord), sortChars(otherWord));
  }

  private static char[] sortChars(String word) {
    char[] chars = word.toLowerCase().toCharArray();
    Arrays.sort(chars);
    return chars;
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
      String currentWord = scanner.next();
      if (Anagram.isAnagram(baseWord, currentWord)) {
        anagrams.add(currentWord);
      }
    }

    System.out.println(anagrams);
  }
}
