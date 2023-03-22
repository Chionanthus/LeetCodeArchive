package LeetCode._844;

import java.util.LinkedList;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> stack1 = new LinkedList<>();
        LinkedList<Character> stack2 = new LinkedList<>();
        for(char c :s.toCharArray())
        {
            if (!stack1.isEmpty() && c=='#')stack1.pop();
            if (c!='#')stack1.push(c);
        }
        for(char c :t.toCharArray())
        {
            if (!stack2.isEmpty() && c=='#')stack2.pop();
            if (c!='#')stack2.push(c);
        }
        return stack2.equals(stack1);
    }
}
