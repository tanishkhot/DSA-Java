public class Reverse {
    public static void main(String[] args) {
        int n = 123456;
        int x = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            x = x*10 + rem;
        }
        System.out.print(x);
    }
}
