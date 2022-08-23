package LeetCode._655;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.lang.Math;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}


public class Solution {
    List<List<String>> Llist = new ArrayList<List<String>>();
    String[][] Slist;
    int height;
    public List<List<String>> printTree(TreeNode root) {
        int depth = getDepth(root);
        height =depth -1;
        int width =(1<<(height+1)) -1;

        Slist = new String[depth][width];
        for (String[] strings : Slist) {
            Arrays.fill(strings,"");
        }

        placeNum(root,0,(width-1)/2);
        for (String[] strings : Slist) {
            Llist.add(Arrays.asList(strings));
        }

        return Llist;
    }

    void placeNum(TreeNode root,int r,int c)
    {
        Slist[r][c]=Integer.toString(root.val);
        int deviate = (1 << (height-r-1));
        if(root.left!=null) placeNum(root.left,r+1,c-deviate);
        if(root.right!=null) placeNum(root.right,r+1,c+deviate);
    }

    int getDepth(TreeNode root)
    {
        if(root==null) return 0;
        return Math.max(getDepth(root.left),getDepth(root.right)) + 1 ;
    }


}
