public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hey baby"));
    }
    public static String reverseWords(String s) {

        String[] words = s.split(" ");
//        String[] reverse = new String[words.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[words.length - i- 1] + " ");
//            reverse[words.length -i -1] = words[i];
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        String ans = sb.toString().trim();

        return ans;
    }


}
