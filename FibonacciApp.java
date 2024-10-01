package gr.aueb.cf.ch5;

/**
 * υπολογίζει την ακολουθία Fibonacci
 */
public class FibonacciApp {

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println("ficonacci sequence is: " + fibonacci(i));
        }
    }

    /**
     * Calculates Fibonacci series with recursion
     * @param n     the n-th Fibonacci terms
     * @return      the Fibonacci term
     */
    public static int fibonacci (int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
