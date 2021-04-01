package 剑指Offer._35_深度复制复杂链表;

public class Solution {

    public Node copyRandomList(Node head) {
        if (head==null) return null;
        Node build = head;
        Node after;
        //第一轮，复制节点，扩充链表
        while(build!=null)
        {
            after = new Node(build.val);
            after.next=build.next;
            build.next=after;
            build=after.next;
        }
        build=head;

        //第二轮，修改random域
        while(build!=null)
        {
            if (build.random!=null)
                build.next.random=build.random.next;
            build=build.next.next;
        }
        //第三轮：拆除
        build=head;
        after=build.next;
        Node ret=head.next;
        while(after.next!=null)
        {
            build.next=build.next.next;
            after.next=after.next.next;
            build=build.next;
            after= after.next;
        }
        build.next=null;
        return ret;
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
