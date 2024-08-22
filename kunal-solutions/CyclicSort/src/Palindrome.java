public class Palindrome {
    public static void main(String[] args) {
        boolean ans  = isPalindrome(10);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int x) {

        String sstr = Integer.toString(x);
        int n = sstr.length();
        for (int j = 0; j < n/2; j++) {
            if(sstr.charAt(j)  != sstr.charAt(n-1)){
                return false;
            }
        }
        return true;
    }


}
