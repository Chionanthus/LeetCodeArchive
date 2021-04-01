package 剑指Offer._54_PreOrder;

public class Solution {
    int ans,count=0;
    public int kthLargest(TreeNode root, int k) {
        recur(root,k);
        return ans;
    }
//注意本题是第K大，从按照中序遍历的反方向遍历
    private void recur(TreeNode root, int k) {
        if(root.right!=null)recur(root.right,k);

        if(++count==k) {
            ans = root.val;
            return;
        }
        if(root.left!=null)recur(root.left,k);
    }

    public
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
