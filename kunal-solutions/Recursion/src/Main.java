public class Main {
    public static void main(String[] args) {
        fiboSeries(5);
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    static void fiboSeries(int n){
        for(int i = 0; i < n ; i++){
            System.out.print(fibo(i));
        }
    }
}

