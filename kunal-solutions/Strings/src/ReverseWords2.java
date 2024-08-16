public class ReverseWords2 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            StringBuilder temp = new StringBuilder(arr[i]);
            sb.append(temp.reverse());
            if(i == arr.length -1){
                continue;
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
