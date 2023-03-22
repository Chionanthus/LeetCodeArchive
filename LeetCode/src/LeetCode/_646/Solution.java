package LeetCode._646;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int num = 1;
        int len = pairs.length;
        int tmp = pairs[0][1];
        for (int i = 1; i < len; i++) {
            if(pairs[i][0]>tmp)
            {
                tmp = pairs[i][1];
                num++;
            }
        }
        return num;
    }


}
