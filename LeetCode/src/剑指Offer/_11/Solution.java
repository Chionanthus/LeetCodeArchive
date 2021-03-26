package 剑指Offer._11;

public class Solution {
    public int minArray(int[] numbers) {
        int l = numbers.length-1;
        for(int i=0;i<l ;i++)
        {
            if(numbers[i]>numbers[i+1])return numbers[i+1];
        }
        return numbers[0];
    }
}
