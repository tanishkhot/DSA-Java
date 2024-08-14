public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,9};
        int target = binarySearch(arr, 6);
        System.out.println(target);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (end - start) / 2;

        if(target > arr[arr.length - 1]){
            return -1;
        }
        //Iterative binary search
        while(start <= end){
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
