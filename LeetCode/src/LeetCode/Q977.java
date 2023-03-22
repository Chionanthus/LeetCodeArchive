package LeetCode;

public class Q977 {
    public int[] sortedSquares(int[] nums) {
        int[] ret = new int[nums.length];
        int loc = nums.length-1;
        for(int i=0,j=nums.length-1; i<=j ;)
        {
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(a < b)
            {
                ret[loc--] = b;
                j--;

            }
            else{
                ret[loc--] = a;
                i++;
            }
        }
        return ret;

    }
}
