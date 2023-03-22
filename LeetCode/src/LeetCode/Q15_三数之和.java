package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 1.先排序是可以保证不重复，但时间复杂度还是没有降低
 * 2.每轮循环枚举与上一次不同的元素、
 * 3.排序后的最小指针的值得是负数，不然和不可能为0
 * 4.第二重循环指针向后，则第三重循环指针向前，时间复杂度降为 O n^2
*/
public class Q15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new LinkedList<>();

        for(int i =0;i<nums.length;i++)
        {
            //确保2.每轮循环枚举与上一次不同的元素
            if(i>0 && nums[i]==nums[i-1])continue;
            int k = nums.length-1;
            for(int j = i+1;j<nums.length;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])continue;

                while(j<k && nums[i]+nums[j]+nums[k]>0)
                {
                    k--;
                }

                if(k==j)break;


                if(nums[i] + nums[j] == -nums[k])
                {
                    List<Integer> temp = new LinkedList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                }


            }
        }
        return list;
    }
}
