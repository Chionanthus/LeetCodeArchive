package 剑指Offer._25_合并链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummyhead=head;
        while (l1!=null&&l2!=null)
        {
            if(l1.val< l2.val)
            {
                head.next=l1;
                head=head.next;
                l1=l1.next;
            }
            else
            {
                head.next=l2;
                head=head.next;
                l2=l2.next;
            }
        }
        if(l1==null)head.next=l2;
        if(l2==null)head.next=l1;
        return dummyhead.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}