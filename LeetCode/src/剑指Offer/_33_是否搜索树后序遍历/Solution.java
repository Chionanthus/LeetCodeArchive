package 剑指Offer._33_是否搜索树后序遍历;

public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    private boolean recur(int[] postorder, int start, int end) {
        if(start>=end)return true;

        //后序遍历的最后一个为根节点
        int k=start;
        int root =postorder[end];//根节点的值，比左子树大，比右子树小
        while(postorder[k]<root)k++;
        int m=k;
        while(postorder[k]>root)k++;
        return k==end&&recur(postorder,start,m-1)&&recur(postorder,m,end-1);
    }
}
