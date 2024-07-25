import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates( new int[] {0,0,1,1,1,2,2,3,3,4});
    }
    public static int removeDuplicates2(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], true);
                list.add(nums[i]);
            }
        }
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        for(int  i = list.size(); i < nums.length; i++){
            nums[i] = 101;
        }
        return list.size();

    }

    //retrying using two pointer method:
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                count++;
            }
        }
        return count;
    }

}
