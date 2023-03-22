package LeetCode._976;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 2; i--) {
            int first =nums[i];
            int second=nums[i-1];
            int third=nums[i-2];
            if(second+third>first)return second+third+first;
        }
        return 0;
    }
}
