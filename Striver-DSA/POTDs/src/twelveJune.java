public class twelveJune {
    public static void main(String[] args) {
        twelveJune obj1 = new twelveJune();
        obj1.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
        public void sortColors(int[] nums) {
            int countZeros = 0;
            int countOnes = 0;
            int countTwos = 0;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0){
                    countZeros++;
                }
                if(nums[i] == 1){
                    countOnes++;
                }
                if(nums[i] == 2){
                    countTwos++;
                }
            }

            int index ;
            index = 0;

            for(int i = 0; i < countZeros; i++){
                nums[i] = 0;
                index++;
            }

            for(int i = index; i < index + countOnes; i++){
                nums[i] = 1;

            }
            index = index + countOnes;
            for(int i = index; i < index + countTwos; i++){
                nums[i] = 2;
            }
            index = index + countTwos;


            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }


}
