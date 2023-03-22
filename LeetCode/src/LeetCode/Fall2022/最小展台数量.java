package LeetCode.Fall2022;

public class 最小展台数量 {
    public int minNumBooths(String[] demand) {
        int[] all = new int[26];
        int index =-1;
        int ret=0;
        for(int i=0;i<demand.length;i++){
            int[] today = new int[26];

            for(int j = 0;j<demand[i].length();j++)
            {
                index =demand[i].charAt(j)-'a';
                today[index]++;
                if(today[index]>all[index]) all[index] = today[index];
            }
        }
        for (int i : all) {
            ret+=i;
        }
        return ret;
    }
}
