package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q347 {

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> priorityQueue  = new PriorityQueue<>(k,( a,b ) ->(a[1]-b[1]));
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i :nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(priorityQueue.size()==k)
            {
                if( entry.getValue()>priorityQueue.peek()[1])
                {
                    priorityQueue.poll();
                    priorityQueue.offer(new int[]{entry.getKey(),entry.getValue()});
                }
            }
            else {
                priorityQueue.offer(new int[]{entry.getKey(),entry.getValue()});
            }
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i]=priorityQueue.poll()[0];
        }

        return ret;


    }

    public static void main(String[] args) {
        Q347 solution = new Q347();
        solution.topKFrequent(new int[]{1,1,1,2,2,3},2);
    }
}
