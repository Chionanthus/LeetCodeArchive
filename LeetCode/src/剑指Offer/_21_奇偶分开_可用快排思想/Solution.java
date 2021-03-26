package 剑指Offer._21_奇偶分开_可用快排思想;

public class Solution {

    public int[] exchange(int[] nums) {
        int count=nums.length-1;
        for(int i=0;i<=count;i++)
        {
            if((nums[i]&1)==0)//偶数
            {
                int temp = nums[i];
                nums[i]=nums[count];
                nums[count--]=temp;
                i--;//用来防止换到前面的也是偶数
            }
        }
        return nums;
    }
}
