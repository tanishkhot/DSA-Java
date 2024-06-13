import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(4);
        second.insertLast(6);
        second.insertLast(7);

        LL ans = first.merge(first, second);
        ans.display();

    }
}