public class FizzBuzz {
    static public void main(String args[]) {
        for (int num = 1; num <= 100; num++) {
            String s = "";
            s += num % 3 == 0 ? "Fizz" : "";
            s += num % 5 == 0 ? "Buzz" : "";
            System.out.println(!s.isEmpty() ? s : num);
        }
    }
}