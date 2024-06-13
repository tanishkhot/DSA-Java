package functions;

public class OverLoading {
    public static void main(String[] args) {
        fun("Sanika");
        fun(67);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }
}

