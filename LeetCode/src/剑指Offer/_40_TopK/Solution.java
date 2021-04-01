package 剑指Offer._40_TopK;

import java.util.PriorityQueue;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length==0||k==0)return new int[0];

        PriorityQueue<Integer> bigheap =new PriorityQueue<>(k,(x,y)->(y-x));//改为大根堆
        //大根堆保证根是最大的，当新元素比堆顶大时丢弃，比堆顶小时先弹出，再插入;
        for(int i=0;i<k;i++)
        {
            bigheap.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]<bigheap.peek())
            {
                bigheap.poll();
                bigheap.add(arr[i]);
            }
        }
        int[] ret=new int[k];
        int temp=bigheap.size();
        for(int i=0;i<temp;i++)
        {
            ret[i]= bigheap.poll();
        }
        return ret;
    }
}
