package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Q209_滑动窗口 {
    public int minSubArrayLen(int target, int[] nums) {
        int record= 0;
        int minlen=0;
        int foreLocation=0;
        for(int i=0;i<nums.length;i++)
        {
            record+=nums[i];
            if(record>=target)
            {
                foreLocation=i;
                break;
            }

        }
        if(record<target) return 0;
        minlen=foreLocation+1;
        // 开始滑动

        for(int i=0;i<nums.length;i++)
        {
            record-=nums[i];

            //如果窗口前部分滑动后仍然大于target，则表明可以用更短来组成
            if (record>=target)
            {
                minlen= Math.min(minlen,foreLocation-i) ;
            }
            // 1 1 1 2 3 4
            //窗口前部分减了之后小了，后部窗口需要往后滑动
            else {
                while(record<target&&foreLocation<nums.length-1)
                    record+=nums[++foreLocation];
            }


        }
        return minlen;
    }
}
