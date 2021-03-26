package 剑指Offer._06_reverseList;

public class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode node =head;
        int count=0;
        while(node!=null)
        {
            count++;
            node=node.next;
        }
        int[]a =new int[count];
        node=head;
        for(int i =count-1;i>=0;i--)
        {
            a[i]=node.val;
            node=node.next;
        }
        return a;
    }

}
    class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}