package tanish;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);


        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <='Z') {
            System.out.print("Uppercase");
        } else {

            System.out.print("Invalid");
        }

    }
}
