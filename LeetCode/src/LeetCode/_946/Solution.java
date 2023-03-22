package LeetCode._946;

import java.util.LinkedList;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        LinkedList<Integer> stack =new LinkedList<>();
        int length = pushed.length;
        int index=0;
        for (int j : pushed) {
            stack.push(j);
            while (!stack.isEmpty()&&stack.peek().equals(popped[index])) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();

    }
}
