import java.util.ArrayList;

public class eightJuly {


    public static void main(String[] args) {
        eightJuly eight = new eightJuly();
        int n = eight.findTheWinner(5,2);
        System.out.println(n);
    }

    static void helper(int n, int k, int ptr, ArrayList<Integer> list){

        if(list.size() == 1){
            return;
        }

        ptr = (ptr + k - 1) % list.size();
        list.remove(ptr);
        //ptr = ptr + 2;
        helper(n , k , ptr, list);
        return;
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int  i = 0; i < n; i++){
            list.add(i+1);
            //The appending is correct
        }
        int ptr = 0;

        helper(n, k , ptr, list);
        return list.get(ptr);
    }
}
