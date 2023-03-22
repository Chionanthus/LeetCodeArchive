package LeetCode._654;

import LeetCode.TreeNode;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }
    public TreeNode buildTree(int[] nums,int left,int right)
    {
        int position = findMaxPosition(nums,left,right);

        if(left>right)return null;

        TreeNode ret = new TreeNode(nums[position]);
        ret.left = buildTree(nums,left,position-1);
        ret.right = buildTree(nums,position+1,right);
        return ret;
    }

    public int findMaxPosition(int[] nums,int left,int right)
    {
        int maxPosition = left;
        for(int i=left;i<=right;i++)
        {
            if (nums[maxPosition]<nums[i])
            {
                maxPosition = i;
            }
        }
        return maxPosition;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr= {3,2,1,6,0,5};

        TreeNode root = solution.constructMaximumBinaryTree(arr);

    }
}
