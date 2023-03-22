package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Q54_打印螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top =0;
        int left =0;
        int right = matrix[0].length-1;
        int down = matrix.length-1;
        LinkedList<Integer> list = new LinkedList<>();
        while(true)
        {
            for(int i=left;i<=right;i++)
            {
                list.addLast(matrix[top][i]);
            }
            if(++top>down)break;
            for(int i=top;i<=down;i++)
            {
                list.addLast(matrix[i][right]);
            }
            if(--right<left)break;
            for(int i=right;i>=left;i--)
            {
                list.addLast(matrix[down][i]);
            }
            if(--down<top)break;
            for(int i=down;i>=top;i--)
            {
                list.addLast(matrix[i][left]);
            }
            if(++left>right)break;
        }
        return list;
    }
}
