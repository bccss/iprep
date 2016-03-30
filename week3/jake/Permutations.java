import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Permutations
{
    public static void main(String args[])
    {
        if (args.length >= 1)
        {
            ArrayList<String> permutations = new ArrayList<>();
            String word = args[0].toLowerCase();
            permutations.add(word);

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext())
            {
                String term = scanner.next().toLowerCase();

                if (!word.equals(term) && word.length() == term.length())
                {
                    char[] wordChars = word.toCharArray();
                    char[] termChars = term.toCharArray();

                    Arrays.sort(wordChars);
                    Arrays.sort(termChars);

                    if (Arrays.equals(wordChars, termChars))
                        permutations.add(term);
                }
            }

            System.out.println(permutations.toString());
        }
    }
}
