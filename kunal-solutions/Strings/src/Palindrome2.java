public class Palindrome2 {




    //From the last problem:
    public static boolean isPalindrome2(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        int left = 0;
        int right = sb.length() - 1;
        int flag = 0;
        while(left < right){

            if(sb.charAt(left) != sb.charAt(right) && flag == 0){
                flag = 1;
                continue;

            }
            left++;
            right--;
        }
        return true;
    }
}
