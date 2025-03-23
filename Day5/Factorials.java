package Day5;
public class Factorials {
    public static int factorial(int n) {
        if (n == 0 || n == 1)  // Handling base case for 0! and 1!
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
