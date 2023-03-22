package LeetCode;

import java.util.Arrays;

public class Q1619 {
    public double trimMean(int[] arr) {
        int len = arr.length;
        int mean=0;
        Arrays.sort(arr);
        for(int i = len/20;i< 19* len/20;i++)
        {
            mean += arr[i];
        }
        return mean/(len*0.9);
    }
}
