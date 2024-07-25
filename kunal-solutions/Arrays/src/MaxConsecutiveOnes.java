public class MaxConsecutiveOnes {
    //brute:
    public static void main(String[] args) {
        int a;
        a = findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1} );
        System.out.println(a);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max= 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                if(count > max) {
                    max = count;
                }
            } else{
                count = 0;
            }

        }
        return max;
    }

}
