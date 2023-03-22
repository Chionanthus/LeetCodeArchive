package LeetCode周赛._22_12_04;

import java.util.Deque;
import java.util.LinkedList;

public class minScore {
    public int minScore(int n, int[][] roads) {
        int[][] graph = new int[n+1][n+1];

        for(int[] arr :roads)
        {
            graph[arr[0]][arr[1]]=arr[2];
            graph[arr[1]][arr[0]]=arr[2];
        }

        int min=100000;
        boolean[] visited = new boolean[n+1];
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1]=true;
        while(!queue.isEmpty())
        {
            int visit = queue.poll();
            for(int i=1;i<=n;i++){
                if(graph[visit][i]!=0)
                {
                    int num=graph[visit][i];
                    //如果该节点没被访问过,添加到访问队列中：
                    if(visited[i]==false)
                    {
                        queue.offer(i);
                        visited[i]=true;
                    }
                    //找连通图中的最小边
                    min = Math.min(min,num);
                }
            }

        }
        return min;




    }

    public static void main(String[] args) {
        minScore solution = new minScore();
        solution.minScore(14,new int[][]
                {{2,9,2308},{2,5,2150},{12,3,4944},
                {13,5,5462},{2,10,2187},{2,12,8132},
                {2,13,3666},{4,14,3019},{2,4,6759},
                {2,14,9869},{1,10,8147},{3,4,7971},
                {9,13,8026},{5,12,9982},{10,9,6459}});
    }
}
