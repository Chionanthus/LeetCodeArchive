package LeetCode._496_单调栈;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        LinkedList<Integer> stack = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            int num=nums2[i];
            while(!stack.isEmpty() && stack.peek()<num)
            {
                stack.pop();
            }
            map.put(nums2[i],stack.isEmpty()? -1 : stack.peek());
            stack.push(num);
        }
        int len = nums1.length;
        int[] ret = new int[len];
        for(int i=0;i<len;i++)
        {
            ret[i]=map.get(nums1[i]);
        }
        return ret;
    }
}
