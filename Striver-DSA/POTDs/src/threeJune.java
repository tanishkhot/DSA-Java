public class threeJune {

    public static void main(String[] args) {
        int ans=threeJune("ajkhe", "juh");
        System.out.println(ans);
    }
    public static int threeJune(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        char[] sArray = new char[sLen];
        char[] tArray = new char[tLen];

        sArray = s.toCharArray();
        tArray = t.toCharArray();
        int commonCount = 0;

        if(s.contains(t)){
            return 0;
        }
        if(!s.contains(Character.toString(tArray[0]))){
            return tLen;
        }
        for(int  i= 0; i < Math.min(tLen,sLen); i++){
            if(sArray[i] == tArray[commonCount]) {
                commonCount++;
            }
            else if(commonCount == tLen){
                break;
            }
        }
        return tLen - commonCount;
    }

    public static int twoPointer(String s, String t){
        int j = 0;
        int commonCount = 0;

        int sLen = s.length();
        int tLen = t.length();
        for (int i = 0; i < sLen; i++) {
            if(j < tLen && s.charAt(i) == t.charAt(j)){
                j++;
                commonCount++;
            }
        }
        return tLen - commonCount;
    }
}
