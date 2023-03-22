package LeetCode;

import java.util.Arrays;

public class Q1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] temp = new int[1005];
        int ret=0;
        for(int [] arr : boxTypes)
            temp[arr[1]] +=arr[0];
        for(int i=1000;i>=0;i--)
        {
            ret += Math.min(truckSize,temp[i])*i;
            truckSize-=temp[i];
            if(truckSize<=0)break;
        }
        return ret;
    }

    public static void main(String[] args) {
        Q1710 solution = new Q1710();
        System.out.println(solution.maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4));
    }
}
