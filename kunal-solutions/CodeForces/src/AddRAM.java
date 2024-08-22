import java.util.Scanner;

public class AddRAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read input values for each test case
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            // Compute the result using the ram method
            int result = ram(n, k);

            // Print the result
            System.out.println(result);
        }

        // Close the scanner
        scanner.close();
    }

    public static int ram(int n, int k) {
        if (k == 1) {
            return n;  // Because you can upload 1GB per second
        } else {
            return (n + k - 1) / k * k;  // This ensures we count the exact seconds required, spreading out the uploads in chunks of k seconds
        }
    }
}
