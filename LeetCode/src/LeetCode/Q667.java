package LeetCode;

import java.util.LinkedList;

public class Q667 {
    LinkedList<Integer> moveNum(LinkedList<Integer> arr , int k)
    {
        if(k==1||k==0 )return arr;
        if(k>1)
        {
            arr.add(arr.size()-k,arr.pollLast());
        }
        return moveNum(arr,k-2);
    }

    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        arr[0]=1;
        for(int i=1,interval = k;i<=k;i++,interval--)
        {
            arr[i] = (i&1) == 1 ? arr[i-1]+interval :arr[i-1]-interval;
        }
        for(int i=k+1;i<n;i++)
        {
            arr[i]=i+1;
        }
        return arr;
    }

    public int[] constructArray2(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++)list.add(i+1);
        list = moveNum(list,k);
        int[] ret = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ret[i]=list.get(i);
        }
        return ret;
    }
}
