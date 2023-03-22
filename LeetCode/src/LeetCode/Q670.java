package LeetCode;

import java.util.Arrays;

public class Q670 {

//    Sort后，从前往后找到第一个和原数组不一样的位置和值，在原数组中倒序找这个值，并和不一样的位置进行交换
    public int maximumSwap(int num) {
        if(num<12)return num;
        int maxNum=0;
        int maxLoc =0;

        char[] nums =  String.valueOf(num).toCharArray();
        Character[] arr = new Character[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = nums[i];
        }
        Arrays.sort(arr,(a,b)-> b-a);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=arr[i])
            {
                maxNum = arr[i];
                maxLoc = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==maxNum)
            {
                char temp = nums[i];
                nums[i] = nums[maxLoc];
                nums[maxLoc] = temp;
                break;
            }
        }
        return Integer.parseInt(String.valueOf(nums));

    }

    public static void main(String[] args) {
        Q670 q670 = new Q670();
        System.out.println(q670.maximumSwap(98368));
    }
}
