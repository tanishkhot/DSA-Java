public class Decrypt {

//    Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//    Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.


    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0) {
            if (s.charAt(i) - '0' > 0 && s.charAt(i) - '9' < 9) {
                builder.append((char)(s.charAt(i)-'0' + 96));
                i--;
            }
            else if (s.charAt(i) == '#') {
                int num = (s.charAt(i-1) - '0') + 10*(s.charAt(i-2) - '0');
                System.out.println("num: " + num);
                builder.append((char)(num + 96));
                i = i-3;
            }
        }
        builder.reverse();
        return builder.toString();
    }

}
