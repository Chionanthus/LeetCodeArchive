package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Q216 {
    LinkedList<Integer> add = new LinkedList<>();
    LinkedList<List<Integer>> allList = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k,n,1);
        return allList;
    }

    void dfs(int k,int n,int startIndex)
    {
        if(n<0)return;
        //k是还需要取多少个数,n是还需要减多少
        if(k==0&&n==0)
        {
            allList.add(new LinkedList<>(add));
            return;
        }

        //startIndex是这一轮已经选了的数字，然后从下一个数字开始选
        for(int i = startIndex;i<=n;i++)
        {
            
            add.addLast(startIndex);
            dfs(k-1,n-startIndex,i+1);
            add.removeLast();
        }
    }

    public static void main(String[] args) {
        Q216 solution = new Q216();
        solution.combinationSum3(3,9);
    }
}
