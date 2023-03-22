package LeetCode;

public class Q707 {
}

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    int size;
    ListNode head,tail;


    public MyLinkedList() {
        size=0;
        head =new ListNode();
        tail = new ListNode();
        head.next = tail;
        tail.prev=head;
    }

    public int get(int index) {
        if(index<0 || index>=size)return -1;

        if(index<size/2){
            ListNode head = this.head;
            for(int i=0;i<=index;i++){
                head=head.next;
            }
            return head.val;
        }
        else{
            ListNode tail = this.tail;
            for(int i=size;i>index;i--)
            {
                tail = tail.prev;
            }
            return tail.val;
        }


    }

    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next=head.next;
        temp.prev = head;
        head.next.prev = temp;
        head.next=temp;
        size++;
    }

    public void addAtTail(int val) {
        ListNode temp = new ListNode(val);
        temp.next=tail;
        temp.prev=tail.prev;
        tail.prev.next=temp;
        tail.prev=temp;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index >size)return;
        if(index <0)addAtHead(val);
        else{
            ListNode temp = this.head;
            for(int i=0;i<index;i++)
            {
                temp = temp.next;
            }
            ListNode add = new ListNode(val);
            add.prev=temp;
            add.next=temp.next;
            temp.next.prev=add;
            temp.next=add;
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        if(index <0||index >=size)return;
        ListNode temp = this.head;
        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        size--;
    }
}
