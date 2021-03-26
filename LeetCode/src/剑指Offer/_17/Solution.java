package 剑指Offer._17;

public class Solution {
    public int[] printNumbers(int n) {
        int  k= (int) Math.pow(10,n)-1;
        int [] a=new int[k];//0~999
        for(int i=0;i<k;i++)//0~999
        {
            a[i]=i+1;
        }
        return a;
    }
}
