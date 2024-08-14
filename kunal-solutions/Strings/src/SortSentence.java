import java.util.Arrays;

public class SortSentence {
    public static void main(String[] args) {
        String ans = sortSentence("is2 sentence4 This1 a3");
        System.out.println(ans);
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");

        //cycle sort:
        int i = 0;
        String current;
        int len;
        int correct;

        while(i < arr.length){
            current = arr[i];
            len = current.length();
            correct = current.charAt(len - 1) - '0' - 1;
            if(i != correct){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[j].substring(0,arr[j].length()-1);
        }

        return String.join(" ",arr);
    }
    private static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
