package 剑指Offer._18;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyhead =head;
        if(head==null)return null;
        if(head.val==val)return head.next;

        //-3 5 -99
        while(head!=null)
        {
            if(head.next.val==val)
            {
                head.next=head.next.next;
                break;//及时break
            }
            head=head.next;
        }
        return dummyhead;

    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }