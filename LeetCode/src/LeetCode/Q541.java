package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Q541 {

    public String reverseStr(String s, int k) {
        char[] c =s.toCharArray();

        int count = k*2;

        int len = s.length();


        for(int i=0;i<len;i+=k*2)
        {
            reverseSubStr(c,i,Math.min(i+k,len)-1);
        }

        return new String(c);
    }

    public void reverseSubStr(char[] s,int begin,int end)
    {
        for(int i=begin,j=end;i<j;i++,j--)
        {
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
    }

    public static void main(String[] args) {
        Q541 solution =new Q541();
        solution.reverseStr(
                "abcdefg",2);
    }
}
