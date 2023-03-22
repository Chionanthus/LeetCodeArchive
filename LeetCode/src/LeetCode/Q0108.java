package LeetCode;

public class Q0108 {
    public void setZeroes(int[][] matrix) {
        int width = matrix[0].length;
        boolean[] column = new boolean[width] ;
        boolean[] row = new boolean[matrix.length];

        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<width;j++)
            {
                if(matrix[i][j]==0)column[j] = row[i] = true;
            }
        }

        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<width;j++)
            {
                if(column[j] || row[i]) matrix[i][j]=0;
            }
        }

    }
}
