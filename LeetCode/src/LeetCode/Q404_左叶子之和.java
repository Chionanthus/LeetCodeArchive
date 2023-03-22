package LeetCode;

public class Q404_左叶子之和 {

    int ret=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root);
        return ret;
    }


    void sum(TreeNode root)
    {
        if(root==null)return;
        sum(root.left);
        if(root.left!=null&&root.left.left==null&&root.left.right==null)ret+= root.left.val;
        sum(root.right);
    }
}
