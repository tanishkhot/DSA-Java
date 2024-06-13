import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        we can create multidimensional arrays. Something similar to calendars.

        1 2 3
        4 5 6
        7 8 9

        int[rows][columns] : rows is mandatory, c is not.
        */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //for loops for rows
        for (int row = 0; row < arr.length; row++) {
            // for loops for columns
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            // for loops for columns
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Use this to make sure there are new lines on the code
        }
    }
}
