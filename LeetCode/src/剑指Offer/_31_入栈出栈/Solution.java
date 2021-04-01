package 剑指Offer._31_入栈出栈;

import java.util.LinkedList;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        LinkedList<Integer> push =new LinkedList<>();
        int j=0;
        int len= popped.length;
        for (int i : pushed) {
            push.push(i);
            while(j<len&&!push.isEmpty()&&push.peek()==popped[j])
            {//可能要持续出栈
                push.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}
