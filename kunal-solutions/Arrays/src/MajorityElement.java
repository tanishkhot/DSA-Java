import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int a  = majorityElement(new int[] {3,2,3});
        System.out.println(a);
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            mp.put(num , mp.getOrDefault(num , 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    //Try sorting the array and then keep moving like you did in consecutive ones. If that exceeds n-1/2, return!


}
