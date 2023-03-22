package LeetCode;

import java.util.HashSet;

public class Q202 {
    public int getNum(int n )
    {
        int ret =1;
        while(n!=0)
        {
            ret += (n%10) * (n%10);
            n /=10;
        }
        return ret;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            n=getNum(n);
        }
        return n==1;

    }

    public static void main(String[] args) {
        Q202 solution  = new Q202();
        solution.isHappy(2);
    }
}
