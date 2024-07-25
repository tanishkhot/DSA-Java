public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        rotateArray(nums);
        for(int n : nums){
            System.out.println(n);
        }
    }
    public static void rotate(int[] nums, int k) {
        for(int i = 0; i < k ; i ++){
            rotateArray(nums);
        }
    }
    private static void rotateArray(int[] nums){
        int n = nums.length;
        int[] temp = new int[n];
        for(int i = 0; i < n;i++){
            temp[(i+1)%n] = nums[i%n];
        }
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }

}
