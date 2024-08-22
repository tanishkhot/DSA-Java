public class Duplicate {

    public static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
        }
        return ;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }


}
