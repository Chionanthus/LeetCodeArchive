package LeetCode;

import java.util.LinkedList;

public class Q239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] ret = new int[nums.length-k+1];
        int count=0;
        for(int i=0;i<k;i++)
        {
            while(!list.isEmpty() && nums[list.peekLast()]<nums[i])list.pollLast();
            list.offerLast(i);
        }
        ret[count++]=nums[list.peekFirst()];
        for(int i=k;i<nums.length;i++)
        {

            while(!list.isEmpty() && nums[list.peekLast()]<nums[i])list.pollLast();
            list.offerLast(i);
            while(list.peekFirst() < i-k+1)list.pollFirst();

            ret[count++]=nums[list.peekFirst()];
        }
        return ret;

    }

    public void pushPriorityQueue(LinkedList<Integer> list,int num,int size)
    {
        while(!list.isEmpty() && list.peekLast()<num)list.pollLast();
        list.offerLast(num);
    }

    public static void main(String[] args) {
        Q239 solution =new Q239();
        System.out.println(); solution.maxSlidingWindow(new int[]{1,3,1,2,0,5},
        3);
    }
}
