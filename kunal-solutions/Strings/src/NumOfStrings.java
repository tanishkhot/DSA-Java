public class NumOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String words = "aaaaabbbbb";
        System.out.println(numOfStrings(patterns, words));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
