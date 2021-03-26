package 剑指Offer._24_逆转链表;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
            ListNode reverlisthead =new ListNode(0);
            reverlisthead.next=head;
            while(head.next!=null)
            {
                ListNode p =head.next;
                head.next=head.next.next;
                //插入p
                p.next=reverlisthead.next;
                reverlisthead.next=p;

            }
            return  reverlisthead.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}