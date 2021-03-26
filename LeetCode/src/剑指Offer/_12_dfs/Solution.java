package 剑指Offer._12_dfs;

public class Solution {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
            {
                if(words[0]==board[i][j])//判断第一位，小小剪枝
                    if(dfs(board,words,i,j,0))//如果这里返回true
                        return true;
            }
        return false;
    }
    public boolean dfs(char[][] board,char[] words,int i,int j,int k)
    {
        if(k== words.length)return true;//说明判断完了
        if(i<0||j<0||i==board.length||j==board[0].length||board[i][j]!=words[k])
            return false;//终止条件
        board[i][j]+=256;
        boolean res = dfs(board,words,i+1,j,k+1)||
                dfs(board,words,i-1,j,k+1)||
                dfs(board,words,i,j+1,k+1)||
                dfs(board,words,i,j-1,k+1);
        //即判断下一位，如果四个都return false，那么他也会return false
        //否则只要有一个是true，他也会return true
        //最终结局是k==index,return ture 然后一层一层回去
        board[i][j]-=256;//即以此点往后的路径已经判别过，该点可释放
        return res;
    }
}
