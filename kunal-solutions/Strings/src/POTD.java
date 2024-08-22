import java.util.Arrays;
import java.util.List;

public class POTD {
    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,4),
                Arrays.asList(0, 5)
                //Arrays.asList(1, 2, 3)
        );
        int a = maxDist2(lists);
        System.out.println(a);

    }


    public int maxDistance(List<List<Integer>> arrays) {
        //Logic: Create a boolean array to see if we chose a number from min mor max and then if you have chosen one from there, choose the other one
        boolean[] arr = new boolean[arrays.size()];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }
        for (int i = 0; i < arrays.size(); i++) {
            for (int j = 0; j < arrays.get(i).size(); j++){

            }
        }
        return 0;
    }

    public static int maxDist(List<List<Integer>> arrays){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arrays.size(); i++) {
            for (int j = 0; j < arrays.get(i).size(); j++) {
                int num = arrays.get(i).get(j);
                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
            }
        }
        return Math.abs(max-min);
    }


    public static int maxDist2(List<List<Integer>> arrays){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        int maxDist = 0;
        for(int i = 0; i < arrays.size(); i++){
            int first = arrays.get(i).get(0);
            int last = arrays.get(i).get(arrays.get(i).size() - 1);
            if (i != minIndex) {
                maxDist = Math.max(maxDist, last - min);
            }
            if (i != maxIndex) {
                maxDist = Math.max(maxDist, max - first);
            }
            if(first < min){

                min = first;
                minIndex = i;
            }
            if(last > max){
                max = last;
                maxIndex = i;
            }
        }
        return Math.abs(max-min);
    }

    static int max3(List<List<Integer>> arrays){
        int maxDist = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            int currentFirst = arrays.get(i).get(0);
            int currentLast = arrays.get(i).get(arrays.get(i).size() - 1);

            maxDist = Math.max(maxDist, Math.abs(currentLast - min));
            maxDist = Math.max(maxDist, Math.abs(max - currentFirst));
            min = Math.min(min, currentFirst);
            max = Math.max(max, currentLast);
        }

        return maxDist;
    }
}
