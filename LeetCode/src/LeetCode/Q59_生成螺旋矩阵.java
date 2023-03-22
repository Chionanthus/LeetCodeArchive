package LeetCode;

public class Q59_生成螺旋矩阵 {
    public int[][] generateMatrix(int n) {
        int begin =0;
        int end = n-1;
        int[][] ret = new int[n][n];
        int num=1;
        while(begin<end)
        {
            for(int i=begin;i<end;i++)
            {
                ret[begin][i]=num++;
            }
            for(int i=begin;i<end;i++)
            {
                ret[i][end]=num++;
            }
            for(int i=end;i>begin;i--)
            {
                ret[end][i]=num++;
            }
            for(int i=end;i>begin;i--)
            {
                ret[i][begin]=num++;
            }
            begin++;
            end--;
        }
        if(n%2==1)ret[n/2][n/2]=num;
        return ret;
    }

    public static void main(String[] args) {
        Q59_生成螺旋矩阵 solution = new Q59_生成螺旋矩阵();
        solution.generateMatrix(5);
    }
}
