package LeetCode._1455;


public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] wordList = sentence.split(" ");
        for (int i = 0 ;i< wordList.length; i++) {
            String s = wordList[i];
            if(s.indexOf(searchWord)==0)
            {
                return i+1;
            }
        }
        return -1;

    }
}
