package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Q76_滑动窗口 {
    public String minWindow(String s, String t) {
        int[] chars = new int[128];
        int[] chart = new int[128];

        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();

        for(int i=0;i<t.length();i++)
        {
            chart[stringT[i]]++;
        }
        int len =0x7fffffff;
        String ret = "";
        int minleft=0,minright=0;
        int left=0,right=0;
        while(right<s.length())
        {
            //右边添加
            chars[stringS[right]]++;
            right++;
            //此时包含所有子串元素，左窗口滑动
            while(  isContain(chars, chart))
            {
                if(len>right-left)
                {
                    len = right - left;
                    minright = right;
                    minleft = left;
                }
                chars[stringS[left]]--;
                left++;
            }
        }
        return s.substring(minleft,minright);
    }

    boolean isContain(int[] a , int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==0)continue;
            if(b[i]>a[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q76_滑动窗口 solution = new Q76_滑动窗口();
        solution.minWindow("ADOBECODEBANC",
                "ABC");
    }
}
