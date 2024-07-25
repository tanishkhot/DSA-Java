import java.lang.reflect.Array;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,42,124,67,81};
        quickSort(arr, 0, arr.length -1);
        reverse(arr);
        for(int num :  arr){
            System.out.print(num + " , ");
        }

    }


    static void reverse(int[] arr){

    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }


        swap(arr, i + 1, high);

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);


            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}