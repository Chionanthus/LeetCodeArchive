package 剑指Offer._16_快速幂;

public class Solution {
    public double myPow(double x, int n) {
        if(x==0)return 0;
        if(n==0)return 1;
        if(n==-1)return 1/x;


        long b=n;
        if(n<0)//有负数幂的测试用例
        {
            b=-b;
            x=1/x;
        }
        double pow=1;
        while(b!=0)
        {
            if((b&1)==1)//快速幂进化
            {
                pow= pow*x;
            }
            b>>=1;
            x*=x;
        }
        return pow;

    }

}
