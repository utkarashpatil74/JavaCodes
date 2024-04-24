package Practice;

import java.util.Scanner;

public class Hacker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int queries = scanner.nextInt();

        // Process each query
        for (int i = 0; i < queries; i++) {
            // Read the values for each query
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Print the series for the current query
            printSeries(a, b, n);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to print the series for a given query
    private static void printSeries(int a, int b, int n) {
        int term = a;

        for (int j = 0; j < n; j++) {
            // Calculate the current term using the formula
            term += Math.pow(2, j) * b;

            // Print the current term
            System.out.print(term + " ");
        }

        // Move to the next line after printing the series for a query
        System.out.println();
    }
}
