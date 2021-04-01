package 剑指Offer._32_层次遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root==null)return new int[0];
        LinkedList<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        List<Integer> arraylist = new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode temp =queue.pop();
            arraylist.add(temp.val);
            if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
        }
//        return arraylist.stream().mapToInt(Integer::valueOf).toArray();//慢,5ms
        int[] ret=new int[arraylist.size()];//相对快,1ms
        for(int i=0;i<arraylist.size();i++)
        {
            ret[i]=arraylist.get(i);
        }
        return ret;
    }


}
