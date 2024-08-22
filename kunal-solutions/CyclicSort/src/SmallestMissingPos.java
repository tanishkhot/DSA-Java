import java.util.Arrays;

public class SmallestMissingPos {

    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int a  = firstMissingPositive(arr);
        System.out.println(a);
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return arr.length + 1;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }

}
