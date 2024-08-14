import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappeared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};


        List<Integer> list = findDisappearedNumbers(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }

    public static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct] ) {
                swap(arr, i, correct );

            }else{
                i++;
            }

        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclic(nums);
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                list.add(j + 1);
            }
        }
        return list;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



}
