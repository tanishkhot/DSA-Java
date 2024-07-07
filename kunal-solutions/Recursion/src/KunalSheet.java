import java.util.Arrays;

public class KunalSheet {
    public static void main(String[] args) {
        int[] arr =  {1,-25,3,1044,0};
        minMax(arr, arr.length -1 , Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static void pascalsTriangle(int[] arr){
        if(arr.length < 1){
            return;
        }
        int[] temp = new int[arr.length -1];
        int x;
        for(int i = 0; i < arr.length-1; i++){
            x = arr[i] + arr[i+1];
            temp[i] = x;
        }

        pascalsTriangle(temp);
        System.out.println(Arrays.toString(temp));


     }

     static void minMax(int[] arr, int index, int max, int min){

        if(index  < 0){
            System.out.println(max + "  " +  min);
            return;
        }


        if(arr[index] > max){
            max = arr[index];
        }

        if(arr[index] < min){
            min  = arr[index];
        }

        minMax(arr, index -1 , max, min);


     }
}
