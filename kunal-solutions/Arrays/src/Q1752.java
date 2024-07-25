import java.util.ArrayList;
import java.util.Arrays;

public class Q1752 {

    public static boolean check(int[] nums) {
        int small = smallestIndex(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[(small + i) % n] < nums[(small + i - 1) % n]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Q1752.check( new int[] {11,23,11,45,67});
    }
    public  static int smallestIndex(int[] nums){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                index = i;
                min = nums[i];
            }
        }
        return index;
    }
}
