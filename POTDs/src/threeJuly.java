import java.util.Arrays;

public class threeJuly {
    public int minDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);



        int minDifference = Integer.MAX_VALUE;



        if (n <= 4) {
            // If the array has 4 or fewer elements, you can change all of them to be the same.
            return 0;
        }

        // Scenario 1
        minDifference = Math.min(minDifference, nums[n-4] - nums[0]);

        // Scenario 2
        minDifference = Math.min(minDifference, nums[n-3] - nums[1]);

        // Scenario 3
        minDifference = Math.min(minDifference, nums[n-2] - nums[2]);

        // Scenario 4
        minDifference = Math.min(minDifference, nums[n-1] - nums[3]);

        return minDifference;


    }
}
