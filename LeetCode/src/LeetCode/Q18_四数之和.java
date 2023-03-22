package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q18_四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int len =nums.length;
        if(nums.length<4)return list;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;

            if((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target)break;
            if((long)nums[i]+nums[len-1]+nums[len-2]+nums[len-3] < target)continue;



            for(int j = i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])continue;
                if((long)nums[i]+nums[j]+nums[j+1]+nums[j+2] > target)break;
                if((long)nums[i]+nums[j]+nums[len-1]+nums[len-2] < target)continue;



                int l=nums.length-1;


                for(int k=j+1;k<nums.length-1;k++)
                {
                    if(k>j+1 &&nums[k]==nums[k-1])continue;

                    while(k<l && (long)nums[i] + nums[j] + nums[k] +nums[l] > target)l--;

                    if(k==l)break;

                    if((long)nums[i] + nums[j] + nums[k] +nums[l] == target)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        list.add(temp);
                    }
                }
            }
        }
        return list;
    }

}
