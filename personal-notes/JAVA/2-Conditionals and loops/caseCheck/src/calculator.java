import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input until user presses x

        int ans = 0;

        while(true){
            System.out.println("Enter the operation");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                // input two numbers
                System.out.println("Enter Num1");
                int num1 = in.nextInt();
                System.out.println("Enter Num2");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1*num2;
                } else if (op == '/') {
                    ans = num1/num2;
                } else if (op == 'x' || op=='X') {
                    break;
                } else {
                    System.out.println("Invalid Input");
                }

            }
            System.out.println("Answer  = " + ans);
        }

    }

}
