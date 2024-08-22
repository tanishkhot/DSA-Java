import java.util.Arrays;

public class MissingInSet {
    public static void main(String[] args) {
        int[] arr = {1,1};
        cycleSort(arr);
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] ans = {-1,-1};
        cycleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }
    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;     //Why did this make a difference? Why is this different than `arr[i] = i+1`?
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
