public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                sb.append(s.charAt(i));
            }
        }
        String fin = sb.toString();
        StringBuilder sb2 = new StringBuilder(fin);
        sb2.reverse();
        String rev = sb2.toString();
        System.out.println(rev);
        if(rev.equals(sb.toString())){
            return true;
        }
        return false;

    }
}
