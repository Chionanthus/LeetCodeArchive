package 剑指Offer._22_链表倒数第K节点;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pioneer =head;
        for(int i=0;i<k;i++)
        {
            pioneer= pioneer.next;
        }
        while(pioneer!=null)
        {
            pioneer=pioneer.next;
            head=head.next;
        }
        return head;
    }
}
 class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }