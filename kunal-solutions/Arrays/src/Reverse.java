public class Reverse {
    public static void main(String[] args) {
        int x  = reverse(-123);
        System.out.println(x);
    }
    public static int reverse(int x) {
        boolean flag = false;
        if(x < 0){
            flag = true;
            x *= -1;
        }

        //Finiding number of digits:
        int dummy = x;
        int count = 0;
        while(dummy > 0){
            count++;
            dummy = dummy/10;
        }
        int reverse = 0;
        int index = 0;



        // We can sue directly FOR loop, because we know how many times it runs
        while(x > 0){
            int digit = x % 10;
            if (reverse > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // This means the next step will overflow
            }
            reverse = reverse*10 + digit;
            index++;
            x = x / 10;
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;



        if(flag){
            return -1*reverse;
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        }

        return reverse;

    }
}
