import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);

    }
    static void reverse(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
