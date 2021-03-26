package 剑指Offer._10_fib;

public class Solution {
    public int fib(int n) {
        if(n==0||n==1)return n;
        int a =1,b=0;
        int ans=0;
        for(int i=1;i<n;i++)
        {
            ans=(a+b)%1000000007;
            b=a;
            a=ans;
        }
        return ans;
    }
    public static int  numWays(int n) {

        if(n==0||n==1)return 1;
        n++;
        int a =1,b=0;
        int ans=0;
        for(int i=1;i<n;i++)
        {
            ans=(a+b)%1000000007;
            b=a;
            a=ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }

}
