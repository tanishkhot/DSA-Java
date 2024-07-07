public class fourthJuly {
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;


        int sum = 0;
        while(curr != null) {
            sum = 0;
            while (curr.val != 0 && curr != null) {
                sum += curr.val;
                curr = curr.next;
            }
            if(curr != null) {
                prev.next = new ListNode(sum);
                prev = prev.next;
                curr = curr.next;
            }
        }
        return head.next;
    }


}
