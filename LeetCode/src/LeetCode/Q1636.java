package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;

public class Q1636 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        list.sort((a,b)->
        {
            int num1= map.get(a);
            int num2 = map.get(b);
            return num1==num2 ? b-a : num1-num2;
        });
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;


//        return list.stream().mapToInt(Integer::intValue).toArray();



    }
}
