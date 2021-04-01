package 剑指Offer._36;

public class Solution {
    Node tail,head;
    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        recur(root);
        head.left=tail;
        tail.right=head;
        return head;
    }
    void recur(Node root)
    {
        if(root==null)
        {
            return;
        }
        recur(root.left);
        if(tail==null)head=root;
        else tail.right=root;
        root.left=tail;
        tail=root;
        recur(root.right);
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
}
