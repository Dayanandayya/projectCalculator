import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number up to which you want to generate the Fibonacci series: ");
        int n = scanner.nextInt();

        // Closing the scanner to avoid resource leak
        scanner.close();

        System.out.println("Fibonacci series up to " + n + ":");
        generateFibonacciSeries(n);
    }

    private static void generateFibonacciSeries(int n) {
        int first = 0, second = 1;

        while (first <= n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
