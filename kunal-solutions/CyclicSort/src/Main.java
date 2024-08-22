import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,3,1,1,4};
        cyclic(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);

            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }
}