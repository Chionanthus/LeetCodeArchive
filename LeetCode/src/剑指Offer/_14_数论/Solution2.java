package 剑指Offer._14_数论;

public class Solution2 {
    public int cuttingRope(int n) {

        if (n == 1 || n == 2) return 1;
        if (n == 3) return 2;
        long sum = 1;
        while (n > 4) {
            sum *= 3;
            sum%=1000000007;
            n -= 3;
        }//值得注意的是，当n==4时，应该是拆为2个2
        return (int)(sum*n%1000000007);
    }
}
