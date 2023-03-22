package LeetCode周赛._22_12_04;

public class isCircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] list = sentence.split(" ");
        for(int i =0;i<list.length-1;i++)
        {
            int len = list[i].length();
            if(list[i].charAt(len-1)!=(list[i+1].charAt(0)))
                return false;
        }
        int len = list.length-1;
        if(list[len].charAt(list[len].length()-1)!=(list[0].charAt(0)))
            return false;
        return true;
    }

    public static void main(String[] args) {
        isCircularSentence solution = new isCircularSentence();
        System.out.println(solution.isCircularSentence("leetcode exercises sound delightful"));

    }
}
