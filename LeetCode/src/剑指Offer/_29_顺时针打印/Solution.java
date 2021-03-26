package 剑指Offer._29_顺时针打印;

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0)return new int[0];
        int top = 0,left=0;
        int button=matrix.length,right=matrix[0].length;
        int count=0;
        int len=button*right;
        int[] ret=new int[len];
        while(left<=right&&top<=button)
        {
            for(int i=left;i<right;i++)
            {
                ret[count++]=matrix[top][i];
                if(count==len)return ret;
            }
            for(int i=top+1;i<button-1;i++)
            {
                ret[count++]=matrix[i][right-1];
                if(count==len)return ret;
            }
            for(int i=right-1;i>left;i--)
            {
                ret[count++]=matrix[button-1][i];
                if(count==len)return ret;
            }
            for(int i=button-1;i>top;i--)
            {
                ret[count++]=matrix[i][left];
                if(count==len)return ret;
            }
            top++;button--;left++;right--;
        }
        return ret ;
    }

}
