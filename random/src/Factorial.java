public class Factorial {

    public int factorial(int n) {
        // Check for input conditions
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Input must be between 0 and 12 (inclusive).");
        }

        // Base case: 0! is 1
        if (n == 0) {
            return 1;
        }

        // Calculate factorial for n using a loop
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    public static void main(String[] args) {
        // Example usage:
        Factorial factorialCalculator = new Factorial();

        try {
            int n = -1;
            int result = factorialCalculator.factorial(n);
            System.out.println(n + "! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}