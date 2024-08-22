import java.util.ArrayList;
import java.util.List;

public class FIndAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1};
        List<Integer> list = findDuplicates(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        cyclic(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
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
