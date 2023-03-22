package LeetCode._1475_单调栈;

import java.util.LinkedList;

public class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] ret = new int[len];
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i=len-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()>prices[i])
            {
                stack.pop();
            }
            ret[i] = stack.isEmpty() ? prices[i]:prices[i]-stack.peek();
            stack.push(prices[i]);
        }
        return  ret;
    }







    public int[] finalPrices2(int[] prices) {
        int len = prices.length;
        for(int i=0;i<len-1 ;i++){
            for(int j=i+1;j<len;j++)
            {
                if(prices[j]<=prices[i])
                {
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }

}
