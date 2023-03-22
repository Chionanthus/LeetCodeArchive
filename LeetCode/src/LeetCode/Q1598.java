package LeetCode;

public class Q1598 {
    public int minOperations(String[] logs) {
        int ret = 0;
        for(String s:logs)
        {
            if(s.equals("./"));
            else if(s.equals("../"))
            {
                if(ret>0)ret--;
            }
            else ret++;

        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println("5678".matches("-?\\d+"));
    }
}
