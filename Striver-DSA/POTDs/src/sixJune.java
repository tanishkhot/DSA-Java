import java.util.Arrays;

public class sixJune {
    public static void main(String[] args) {
        sixJune test = new sixJune();
        boolean ans = test.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3);
        System.out.println(ans);
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        int n = hand.length;
        if(n % groupSize != 0){
            return false;
        }

        
        return true;
    }


}
