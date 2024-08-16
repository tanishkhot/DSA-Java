public class Nto1 {
    public static void main(String[] args) {
//        print(5);
        int i = 0;
        printAsc(5);
    }
    public static void print(int n){
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(" "+ n + " ") ;
        print(n-1);
    }
    static void printAsc(int n ){
        if(n == 0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printAsc(n -1);
        System.out.println(n);
    }
}
