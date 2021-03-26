package 剑指Offer._28_对称二叉树;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return recur(root.left,root.right);
    }
    public boolean recur(TreeNode left,TreeNode right)
    {
        if(left==null&&right==null)return true;
        else if(left==null||right==null||left.val!=right.val)
            return false;
        return recur(left.left, right.right)&&recur(left.right, right.left);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }