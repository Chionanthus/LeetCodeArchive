package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Q77 {
    LinkedList<List<Integer>> allList = new LinkedList<>();
    LinkedList<Integer> add = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {

        backTracing(1,n,k);

        return allList;

    }
    void backTracing(int num,int n,int k)
    {
        // k 是还需要取多少个数
        if(k==0)
        {
            allList.add(new LinkedList<>(add));
            return;
        }

        //num是当前取了的数字，然后从num+1~n里取下一个数字
        for(int i = num;i <= n - (k-add.size())+1 ;i++)
        {
            add.addLast(i);
            backTracing(i+1,n,k-1);
            add.removeLast();
        }
    }

    public static void main(String[] args) {
        Q77 solution = new Q77();
        solution.combine(4,2);
    }
}
