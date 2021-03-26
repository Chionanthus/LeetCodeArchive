package 剑指Offer._13_dfs;

public class Solution {
    boolean[][] isVisited;
    public int movingCount(int m, int n, int k) {
        isVisited=new boolean[m][n];
        return dfs(0,0,m,n,k);
    }
    public int dfs(int i,int j,int m,int n,int k)
    {
        if(i<0||j<0||i>=m||j>=n||i/10+i%10+j/10+j%10>k|| isVisited[i][j])
            return 0;
        isVisited[i][j]=true;
        return 1+dfs(i+1,j,m,n,k)+dfs(i-1,j,m,n,k)+dfs(i,j+1,m,n,k)+dfs(i,j-1,m,n,k);
    }
}
