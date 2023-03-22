package LeetCode;

class Solution{
    public int numSpecial(int[][] mat) {
        int[] cols = new int[mat[0].length];
        int[] rows =new int[mat.length];
        int collen = mat[0].length , rowlen = mat.length;
        int num=0;
        outer:
        for(int i=0;i<rowlen;i++)
        {
            inner:
            for(int j=0;j<collen;j++)
            {

                if(mat[i][j]==1)
                {
                    if(rows[i]==1)continue outer;
                    if(cols[j]==1)continue inner;

                    // 上下左右查一下
                    for(int top =i-1;top>=0;top--)
                    {
                        if(mat[top][j]==1)
                        {
                            cols[j]=1;
                            continue inner;
                        }
                    }
                    for(int down =i+1;down<rowlen;down++)
                    {
                        if(mat[down][j]==1)
                        {
                            cols[j]=1;
                            continue inner;
                        }
                    }
                    for(int left = j-1;left>=0;left--)
                    {
                        if(mat[i][left]==1)
                        {
                            rows[i]=1;
                            continue inner;
                        }
                    }
                    for(int right =j+1;right<collen;right++)
                    {
                        if(mat[i][right]==1)
                        {
                            rows[i]=1;
                            continue inner;
                        }
                    }
                    num++;
                }
            }
        }
        return num;
    }
}