package 剑指Offer._07_buildTree;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0, preorder.length-1,inorder,0, inorder.length-1);
    }
    public TreeNode build(int[] preorder,int pl,int pr, int[] inorder,int il,int ir)
    {
        if(pl>pr||il>ir)return null;
        int rootval=preorder[pl];//pl是当前递归的前序数组中的第一个

        int i;
        for(i=il;i<=ir;i++)//在中序数组相应的范围里找
        {
            if(inorder[i]==rootval)break;
        }
        //此时i就是当前的根的位置

        //pl=0 pr=4 i=i 0 4
        TreeNode root = new TreeNode(rootval);
        root.left=build(preorder,pl+1,pl+i-il,inorder,il,i-1);
        root.right=build(preorder,pl+i-il+1,pr,inorder,i+1,ir);
        return root;
    }
}
 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }