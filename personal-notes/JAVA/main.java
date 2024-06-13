import java.util.Scanner;

class sumUptoN {
    int n;
    int res = 0;

    sumUptoN(){
        System.out.println("Using constructor ");
        System.out.println("Please enter the number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(int i = 0; i < n+1 ; i++){
            res += i^2;
        }
        System.out.println(res);
    }

    public void sumOfSq(){
        res = 0;
        System.out.println("Using inline function");
        System.out.println("Please enter the number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0; i<n+1; i++){
            res += i^2;
        }
        System.out.println(res);
    }
}

class Main{
    public static void main(String[] args) {
        sumUptoN S1 = new sumUptoN();
        S1.sumOfSq();   
    }
}