package functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    static boolean isArmstrong (int n) {
        int sum = 0;
        int originalNumber = n;  //my problem was that I was not storing the number here.
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
        return sum == originalNumber; // and I was comparing it to n
    }
}
