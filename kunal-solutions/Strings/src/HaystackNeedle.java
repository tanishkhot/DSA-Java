public class HaystackNeedle {
    public static void main(String[] args) {
        System.out.println(strStr("a" ,"a"));
    }
    public static int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        for(int i = 0; i < haystack.length() - needleLength+1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(needle.equals(haystack.substring(i, i + needleLength))){
                    return i;
                }
            }
        }
        return -1;
    }
}
