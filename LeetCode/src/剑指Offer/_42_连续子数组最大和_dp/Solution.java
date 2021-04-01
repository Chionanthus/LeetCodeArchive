package 剑指Offer._42_连续子数组最大和_dp;

public class Solution {
    public int maxSubArray(int[] nums) {
        int[]dp =new    int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<nums.length;i++)
        {
            dp[i]=dp[i-1]<=0? nums[i]:nums[i]+dp[i-1];
            if(dp[i]>max)max=dp[i];
        }
        return max;
    }
}
