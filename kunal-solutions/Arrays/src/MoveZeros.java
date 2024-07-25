import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros2(nums);
        for(int num : nums){
            System.out.print(num + " , ");
        }
    }



    // 1. Brute Approach
    public static void moveZeroes(int[] nums) {
        List<Integer> nonZero = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nonZero.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i < nonZero.size()){
                nums[i] = nonZero.get(i);
            }
            else{
                nums[i] = 0;
            }
        }
    }



    // 2. Optimal Approach
    public static void moveZeros2(int[] nums){
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] != 0){
                swap(i , j , nums);
                i++;
            }
            j++;
        }
    }
    static void  swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
