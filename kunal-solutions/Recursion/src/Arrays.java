public class Arrays {

    public static void main(String[] args) {
        int[] arr = {1,2,1 ,4};
        System.out.println(linearSearch(arr, 12, 0));
    }
    static boolean isSorted(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr, ++i);
    }

    static boolean linearSearch(int[] arr, int target, int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || linearSearch(arr, target, ++i);

    }
}
