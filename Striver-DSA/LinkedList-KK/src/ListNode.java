import java.util.List;

//  Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public void display(ListNode list1){
        ListNode temp = list1;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args) {

    }
}


