package LeetCode._1470;

public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] ret = new int[2*n];
        int counter = 0;
        // 独立使用一个变量记录位置
        for(int i =0;i<n;i++ )
        {
            ret[counter++] = nums[i];
            ret[counter++] = nums[i+n];
        }
        return ret;
    }
}
