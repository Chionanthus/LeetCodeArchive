package 剑指Offer._26_树的子结构;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null)return false;
        return  recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);

        //这里递归的不是B的子节点，而是完整的B
    }

    public boolean recur(TreeNode A, TreeNode B)
    {
        if(B==null)return true;
        if(A==null) return false;
        if(A.val!=B.val)return false;
        return recur(A.right,B.right)&&recur(A.left,B.left);
    }
}
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }