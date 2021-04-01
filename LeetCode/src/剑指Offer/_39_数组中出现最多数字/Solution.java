package 剑指Offer._39_数组中出现最多数字;

public class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int record=0;
        for(int num:nums)
        {
            if(count==0)record=num;
            count+= (record==num)? 1:-1;
        }
        return record;
    }

}
