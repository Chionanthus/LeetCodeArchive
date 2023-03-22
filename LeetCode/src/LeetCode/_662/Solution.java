package LeetCode._662;

import LeetCode.TreeNode;

import java.util.LinkedList;

public class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        root.val=1;
        TreeNode tmp;
        int margin = 0;

        while(!queue.isEmpty())
        {
            int size = queue.size();
            int left=0;
            int right = 0;
            for(int i =0;i<size;i++)
            {
                tmp = queue.poll();
                if(i==0)left=tmp.val;
                if(i==size-1)right=tmp.val;
                if(tmp.left!=null)
                {
                    tmp.left.val=tmp.val*2;
                    queue.add(tmp.left);
                }
                if(tmp.right!=null)
                {
                    tmp.right.val=tmp.val*2+1;
                    queue.add(tmp.right);
                }
            }

            if(margin<right-left) margin=right-left;
        }
        return margin +1 ;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1,new TreeNode(3,new TreeNode(5,new TreeNode(6),null),null)
                ,new TreeNode(2,null,new TreeNode(9,new TreeNode(7),null)));
        solution.widthOfBinaryTree(treeNode);
    }


}
