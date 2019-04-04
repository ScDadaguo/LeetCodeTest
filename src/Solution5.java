import java.util.List;

public class Solution5 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = reverseList(head.next);

        return head;
    }



    public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
}
