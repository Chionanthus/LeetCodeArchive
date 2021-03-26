package 剑指Offer._027_二叉树镜像;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp) ;
        return root;
    }
}
 class TreeNode {
     int val;
      TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}