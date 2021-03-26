package 剑指Offer._04;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)return false;
        int n=matrix.length;int m=matrix[0].length;


        int row=0;
        int column=matrix[0].length-1;
        while(column>=0&&row<n)
        {
            if(target>matrix[row][column])
            {
                row++;
            }
            else if(target<matrix[row][column])
            {
                column--;
            }
            else return true;
        }
        return false;
    }
}