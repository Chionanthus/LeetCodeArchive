package LeetCode周赛._23_3_19;

public class checkValidGrid {
    public boolean checkValidGrid(int[][] grid) {

        int n = grid.length;// 7
        int allCount = n*n-1;
        int lRow = 0,lCol = 0;
        int step =0;
        for(int i = 0;i <= allCount ;i++)
        {
            if(lRow - 2 >=0 && lCol + 1 < n && grid[lRow-2][lCol +1] == step+1)
            {
                lRow-=2;
                lCol+=1;
                step+=1;
                continue;
            }
            if(lRow - 1 >=0 && lCol + 2 < n && grid[lRow-1][lCol +2] == step+1)
            {
                lRow-=1;
                lCol+=2;
                step+=1;
                continue;
            }
            if(lRow + 1 < n && lCol + 2 < n && grid[lRow+1][lCol +2] == step+1)
            {
                lRow+=1;
                lCol+=2;
                step+=1;
                continue;
            }
            if(lRow + 2 < n && lCol + 1 < n && grid[lRow+2][lCol +1] == step+1)
            {
                lRow+=2;
                lCol+=1;
                step+=1;
                continue;
            }
            if(lRow + 2 < n && lCol - 1 >=0 && grid[lRow+2][lCol -1] == step+1)
            {
                lRow+=2;
                lCol-=1;
                step+=1;
                continue;
            }
            if(lRow + 1 < n && lCol - 2 >=0 && grid[lRow+1][lCol -2] == step+1)
            {
                lRow+=1;
                lCol-=2;
                step+=1;
                continue;
            }
            if(lRow - 1 >=0 && lCol - 2 >=0 && grid[lRow-1][lCol -2] == step+1)
            {
                lRow-=1;
                lCol-=2;
                step+=1;
                continue;
            }
            if(lRow - 2 >=0 && lCol - 1 >=0 && grid[lRow-2][lCol -1] == step+1)
            {
                lRow-=2;
                lCol-=1;
                step+=1;
                continue;
            }
            break;
        }
        return step == allCount;
    }

    public static void main(String[] args) {
        int [][] test = new int[][]{{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        checkValidGrid solution = new checkValidGrid();
        solution.checkValidGrid(test);
    }
}
