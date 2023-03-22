package LeetCode._1460;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int [] ret = new int[1001];
        for (int i : target) {
            ret[i]++;
        }
        for (int i : arr) {
            if(--ret[i]<0)return false;
        }
        return true;

    }
}
