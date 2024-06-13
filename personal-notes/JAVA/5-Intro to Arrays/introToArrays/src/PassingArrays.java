import java.util.Arrays;

public class PassingArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        change(array1);
        System.out.println(Arrays.toString(array1));
        }
    static void change(int[] arr) {
        arr[0] = 99;


    }
}
