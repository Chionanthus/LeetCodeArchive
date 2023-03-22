package LeetCode._998;
import LeetCode.TreeNode;

public class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root==null) return null;

        // 如果val大于当前的根节点，val就会插到当前根节点的右上
        // 在数组中表现为插到root的
        // 因为val值是插在数组最后，肯定在最右
        if(val > root.val)
        {
            TreeNode nn = new TreeNode(val);
            nn.left = root;
            return nn;
        }
        TreeNode iter = root;
        while(iter.right !=null)
        {
            if(val >iter.right.val)
            {
                TreeNode nn = new TreeNode(val);
                nn.left=iter.right;
                iter.right=nn;
                return root;
            }
            iter=iter.right;
        }
        // 此时iter指向最右，右节点为空且val比当前值小
        TreeNode nn = new TreeNode(val);
        iter.right=nn;
        return root;

    }
}
