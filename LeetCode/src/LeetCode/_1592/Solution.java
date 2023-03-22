package LeetCode._1592;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public String reorderSpaces(String text) {
        int blank =(int)(text.chars().filter(Character::isWhitespace).count());
        if(blank==0)return text;
        int wordCount = text.trim().split("\\s+").length-1;
        if(wordCount==0)return text.trim()+" ".repeat(blank);
        String margin = " ".repeat( blank/wordCount) ;
        String marginBack =" ".repeat(blank%wordCount);
        String ret = Stream.of(text).flatMap(s -> Arrays.stream(s.trim().split("\\s+"))).collect(Collectors.joining(margin));
        return ret+marginBack;
    }

    public String reorderSpaces2(String text) {
        int blank =(int)(text.chars().filter(Character::isWhitespace).count());
        if(blank==0)return text;
        String[] word = text.trim().split("\\s+");

        int wordCount = word.length-1;
        if(wordCount==0)return text.trim()+" ".repeat(blank);
        String margin = " ".repeat( blank/wordCount) ;
        String marginBack =" ".repeat(blank%wordCount);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<wordCount;i++)
        {
            sb.append(word[i]);
            sb.append(margin);
        }
        sb.append(word[word.length-1]);
        sb.append(marginBack);
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reorderSpaces("  this   is  a sentence "));
    }
}
