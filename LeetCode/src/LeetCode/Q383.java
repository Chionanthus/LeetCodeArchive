package LeetCode;

import java.util.HashMap;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        char[] magchar = magazine.toCharArray();
        char[] ranchar = ransomNote.toCharArray();
        for(char c :magchar)
        {
            mag[c-'a']++;
        }
        for(char c :ranchar)
        {
            if(--mag[c-'a']<0)return false;
        }
        return true;
    }
}
