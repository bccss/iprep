import java.util.*;

public class fizzbuzz {

	public static int returnRandom() {
		Random rand = new Random();
		return rand.nextInt(100) + 1;	
	}

	public static void main (String [] args) {
		int count = 1;
		int randomNumber = returnRandom();
		while (count < 101) {
			while (randomNumber != count) {
				randomNumber = returnRandom();
			}
			if ((randomNumber%3 == 0) && (randomNumber%5 == 0))
				System.out.println("FizzBuzz");
			else if (randomNumber%3 == 0)
				System.out.println("Fizz");
			else if (randomNumber%5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(randomNumber);
			count++;
		}
	}
}