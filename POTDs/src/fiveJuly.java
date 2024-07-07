//public class fiveJuly {
//    public static void main(String[] args) {
//
//    }
//
//    public int[] nodesBetweenCritical(ListNode head) {
//        int n = 1;
//        ListNode temp = head;
//        while(temp.next != null){
//            n++;
//            temp = temp.next;
//        }
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        ListNode start, end;
//        start = head;
//        end = head;
//
//        int startFlag = 0;
//        for (int i = 0; i < n; i++) {
//            if(isNextCP(start)){
//                startFlag = 1;
//            }
//        }
//
//
//        int[] ans = {min, max};
//        return ans;
//    }
//
//
//
//    public int[] ans(ListNode head){
//        if(head == null || head.next == null || head.next.next == null){
//            return new int[] {-1,-1};
//        }
//
//        int index = 1;
//        int firstCP, lastCP;
//        int minDistance = Integer.MAX_VALUE;
//        firstCP = lastCP = -1;
//        ListNode prev = head;
//        ListNode curr = head.next;
//        ListNode next = curr.next;
//
//
//        while(next != null){
//            if((curr.val > prev.val && curr.val > next.val) ||  (curr.val < prev.val && curr.val < next.val)){
//                if(firstCP == -1){
//                    firstCP = index;
//                }
//                else{
//                    minDistance = Math.min(minDistance , index - lastCP);
//                    lastCP = index;
//                }
//                lastCP = index;
//            }
//
//            index++;
//            prev = curr;
//            curr = next;
//            next = next.next;
//        }
//
//        if(firstCP == -1 || lastCP == firstCP){
//            return new int[] {-1,-1};
//        }
//
//
//        return new int[] { minDistance, lastCP - firstCP};
//    }
//
//}
