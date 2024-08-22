public class Nto1 {
    public static void main(String[] args) {
        System.out.println(reverse(1342 ));
    }
    public static void  print(int n){
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(" "+ n + " ") ;
        print(n-1);
    }
    static void printAsc(int n ){
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printAsc(n -1);
        System.out.println(n);
    }
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int sumOfDigits(int n){
        if(n  == 0){
            return n;
        }
        return (n%10) + sumOfDigits(n /  10);
    }

    static int reverse(int n){
        return helper(n,0);
    }
    static int helper (int n, int m) {
        if (n == 0) {
            return m;
        }
        m = m * 10 + n % 10;  // Shift m to the left and add the last digit of n
        return helper(n / 10, m);
    }
}
