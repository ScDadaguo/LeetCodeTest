import java.util.List;
/**
* @Description: 206.反转链表 用递归方式
* @Param:
* @return:
* @Author: 文兆杰
* @Date: 2019/4/4
*/
public class Solution5 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node=reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return head;
    }



    public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
}
