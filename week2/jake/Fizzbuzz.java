public class Fizzbuzz
{
    public static void main(String[] args)
    {
        for (int count = 1; count < 100; count++)
            System.out.println(count % 3 == 0 ? count % 5 == 0 ? "Fizzbuzz" : "Fizz" : count % 5 == 0 ? "Buzz" : count);
    }
}