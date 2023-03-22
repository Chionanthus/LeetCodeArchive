package LeetCode;

import java.util.Arrays;

public class Q1608 {
//    首先特征值只会在0~nums.length
//    排序后为有序数组，则每轮从后往前数只有i个大于等于i的数
//    即nums[n-i-1]需要小于i,后面的需要大于等于i

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0]>=n)return n;
        for (int i = 1; i < n; i++) {
            if(nums[n-i]>=i &&nums[n-i-1]<i)return i;
        }
        return -1;
    }

}
