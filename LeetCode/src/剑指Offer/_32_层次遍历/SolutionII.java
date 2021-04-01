package 剑指Offer._32_层次遍历;

import java.util.LinkedList;
import java.util.List;

public class SolutionII {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue= new LinkedList<>();
        List<List<Integer>> ret= new LinkedList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty())
        {
            LinkedList<Integer> temp =new LinkedList<>();
            for(int i=queue.size();i>0;i--)
            {
                TreeNode t =queue.pop();
                temp.add(t.val);
                if(t.left!=null) queue.add(t.left);
                if(t.right!=null)queue.add(t.right);
            }
            ret.add(temp);
        }
        return ret;
    }
}
