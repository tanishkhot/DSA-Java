import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PlusOne {

    public static void main(String[] args) {
        int[] a = PlusOne.plusOne(new int[] {1,2,3});
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] plusOne(int[] digits) {

        int number = 0;
        int n = digits.length;
        for (int i = 0; i < digits.length; i++) {
            number += digits[i] * Math.pow(10 , (n-i-1));
        }
        number++;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n-1; i >= 0 ;i--){
            list.add(number % 10);
            digits[i] = number % 10;
            number = number /10;
        }
        int[] array = new int[list.size()];
        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(list.get(i));
        }
        return array;
    }
}
