package LeetCode;

public class Q1800_模拟 {
    public int maxAscendingSum(int[] nums) {

        int left =0,right=1,count=nums[0];
        int max = count;
        while(right<nums.length)
        {
            if(nums[right-1]<nums[right])
            {

                count+=nums[right];
                right++;
                max = Math.max(count,max);
            }
            else
            {
                left=right;
                right++;
                count = nums[left];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Q1800_模拟 solution = new Q1800_模拟();
        solution.maxAscendingSum(new int[]{10,20,30,5,10,50});
    }
}
