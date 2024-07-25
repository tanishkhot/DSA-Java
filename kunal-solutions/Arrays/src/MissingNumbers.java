import java.util.HashMap;
import java.util.Map;

public class MissingNumbers {
    public static void main(String[] args) {
        int b = missingNumber(new int[] {3,0,1});
        System.out.println(b);
    }

    //Most optimal:  Do it with sum
    public static int missingNumber2(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int n = nums.length + 1;
        int a = n*(n-1)/2;
        return a - sum;
    }

    public static int missingNumber(int[] nums){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i] , 0) + 1);
        }
        for(int i = 0 ;i <= nums.length ;i++){
            if(!mp.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
