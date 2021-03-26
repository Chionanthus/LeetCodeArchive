package 剑指Offer._03;

import java.util.HashSet;

class Solution {
    public static int findRepeatNumber(int[] nums) {
        if(nums==null || nums.length==0) return -1;
        for(int i = 0 ; i < nums.length;i++){
            //如果该数字没有不和他的索引相等
            while(nums[i]!=i){
                //重复返回
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                //不重复交换
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a ={4, 1, 2, 4, 3};
        System.out.println(findRepeatNumber(a)
        );
    }
}
