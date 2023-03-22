package LeetCode.Fall2022;

import java.util.Arrays;
import java.util.HashMap;

public class 美观的花束 {
    public int beautifulBouquet(int[] flowers, int cnt) {
        int ret = cnt *(flowers.length-cnt+1 +flowers.length)/2;
        for(int len = cnt+1;len<flowers.length;len++)
        {
            int left =0,right = left+len;

            while(right<flowers.length)
            {
                if(checkCnt(flowers,left,right,cnt))
                {
                    ret++;
                }
                left++;
                right++;

            }

        }
        return ret;
    }
    boolean checkCnt(int[] flowers,int left,int right,int cnt)
    {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=left;i<=right;i++)
        {
            int get = count.getOrDefault(flowers[i],0);
            if(get == cnt)return false;
            count.put(flowers[i],get+1);
        }
        return true;

    }

}


/**
 * [94424,1528,77425,10318,73610,39031,4332,20045,44930,72801,64702,35025,4332,44930,55086,77425,93695,35025,77425,17341,71964,71964,31003,77425,73610,93695,77425,44666,90456,39036,292,292,90456,32800,25029,9431,88650,4587,99009,55086,39036,3139,39031,94424,4587,39036,64702,46019,1528,39036,55086,58028,15484,39031,17341,81768,44930,22636,22498,17341,71964,3139,1528,9431,4587,65904,32800,2047,55086,1528,39031,39036,20748,17341,1528,55086,32800,60533,22636,73610,73610,9431,73610,94424,39036,69632,69632,44666,44666,99009,53393,39031,4587,1528,39031,88650,2047,35025,39036,9431,90456,20748,90456,31003,64702,4332,71964,69632,44930,93695,90456,32800,15484,81768,81768,3139,22636,64702,15484,82669,97888,99009,44930,71964,39036,53393,9431,39036,75553,53393,4332,5736,75553,10318,5736,1528,26318,71964,94424,25029,88650,3139,73610,53393,75553,94424,20748,26318,81768,39031,17341,46019,44666,5736,65904,20045,39228,71964,73610,44666,39228,4332,90456,90456,15484,97888,60533,94424,90456,82669,292,15484,25029,97888,72801,65904,99009,64702,22498,5736,4332,292,35025,77425,97888,88650,15484,4587,65904,292,71964,2047,22636,82669,10318,31003,97888,44666,69632,22498,72801,77425,5736,32800,88650,69632,39036,39031,20045,10318,20045,2047,55086,1528,55086,10318,93695,39031,60533,44930,93695,97888,65904,81768,97888,15484,39036,35025,10318,71964,39228,22636,20748,69632,71964,22498,17341,73610,81768,90456,58028,93695,9431,72801,77425,53393,20748,93695,25029,3139,71964,77425,15484,60533,69632,73610,82669,44930,72801,22424,72801,65904,5736,55086,292,60533,44930,93695,9431,22424,55086,93695,10318,65904,94424,10318,93695,2047,97888,71964,82669,15484,88650,88650,53393,292,20045,17341,17341,4332,292,53393,44930,4587,93695,26318,22498,82669,77425,71964,71964,35025,46019,10318,15484,64702,82669,22636,94424,55086,44666,93695,2047,5736,99009,292,65904,69632,35025,20045,22636,65904,81768,39031,39031,88650,9431,53393,15484,20045,292,94424,17341,20045,99009,292,81768,22498,90456,93695,10318,72801,60533,3139,73610,26318,75553,65904,77425,82669,93695,20045,15484,3139,17341,35025,22424,39228,17341,22424,93695,39228,39036,69632,32800,39228,65904,65904,39228,69632,88650,93695,26318,22424,22498,20748,97888,94424,97888,2047,99009,20045,75553,99009,39031,20748,60533,44930,90456,39036,88650,65904,31003,22424,1528,88650,88650,31003,26318,44930,71964,3139,22636,32800,15484,99009,72801,39228,25029,25029,82669,39228,22424,90456,65904,60533,44930,60533,69632,93695,15484,292,39036,5736,1528,35025,32800,53393,20748,82669,39036,39036,20748,35025,44666,4332,46019,15484,32800,55086,20748,35025,4332,39036,44930,5736,10318,9431,26318,44666,10318,53393,97888,31003,3139,81768,1528,81768,32800,32800,97888,77425,25029,82669,3139,35025,90456,73610,88650,88650,292,292,4587,22498,88650,39036,58028,32800,22424,22498,64702,77425,39228,82669,17341,88650,26318,64702,32800,22424,94424,1528,93695,46019,72801,75553,20045,44666,88650,31003,94424,93695,60533,69632,292,39036,22498,20045,292,60533,90456,97888,97888,53393,58028,90456,39036,35025,22636,31003,3139,93695,90456,81768,77425,75553,65904,46019,65904,35025,71964,55086,39031,17341,46019,58028,31003,58028,46019,77425,77425,25029,39228,93695,2047,58028,99009,26318,69632,77425,82669,97888,94424,94424,82669,9431,65904,64702,39036,65904,17341,58028,35025,58028,69632,65904,90456,22498,65904,94424,90456,99009,20045,20045,46019,46019,94424,64702,88650,44930,292,39031,81768,69632,4587,22498,73610,94424,44666,60533,1528,22498,2047,75553,97888,75553,22636,58028,4332,44666,94424,90456,53393,5736,99009,72801,58028,32800,88650,88650,44930,55086,5736,3139,60533,17341,60533,31003,15484,3139,22424,71964,81768,10318,75553,15484,32800,15484,72801,4332,39228,22424,25029,25029,44666,71964,81768,44666,75553,75553,15484,39031,17341,65904,64702,4332,4332,292,39036,88650,2047,99009,72801,9431,39036,99009,72801,39036,46019,22636,39036,82669,35025,22498,81768,72801,39228,39031,4587,72801,15484,2047,4332,15484,77425,35025,46019,39228,39031,39228,5736,15484,46019,75553,31003,39036,3139,22498,99009,94424,20045,93695,46019,5736,94424,75553,31003,93695,15484,90456,10318,35025,292,94424,31003,73610,99009,72801,17341,90456,94424,75553,44930,77425,39228,93695,60533,20748,17341,44930,10318,46019,25029,31003,60533,81768,20748,72801,46019,20045,77425,81768,1528,9431,99009,60533,20748,9431,60533,10318,58028,69632,99009,292,1528,53393,90456,4332,82669,22498,1528,97888,292,44666,35025,81768,25029,94424,35025,39228,32800,94424,32800,99009,97888,64702,20045,22424,31003,9431,32800,69632,4332,97888,53393,69632,75553,2047,26318,39228,39036,44930,46019,88650,90456,53393,292,20748,4587,3139,39036,22424,22498,20045,94424,4332,4332,35025,25029,73610,97888,97888,39031,31003,32800,292,93695,4332,4587,10318,65904,26318,39036,4587,5736,81768,4587,60533,2047,82669,69632,26318,26318,31003,64702,15484,97888,32800,44666,82669,64702,69632,292,39228,46019,25029,64702,17341,39228,22636,58028,3139,58028,53393,4587,9431,73610,2047,15484,4587,44666,35025,72801,2047,97888,64702,17341,15484,1528,5736,22498,44930,97888,10318,20748,94424,31003,10318,72801,44930,58028,5736,64702,81768,20045,31003,75553,44666,93695,39031,93695,77425,75553,77425,46019,99009,90456,22636,4332,39036,9431,93695,69632,88650,39228,82669,75553,4587,94424,32800,44666,82669,39036,44930,77425,71964,39036,4332,58028,22498,53393,64702,2047,22636,46019,22498,58028,71964,99009,9431,44666,81768,58028,39036,15484,73610,3139,22636,97888,2047,3139,3139,5736,99009,26318,5736,25029,73610,75553,53393,82669,44666,4332,99009,20045,1528,15484,97888,9431,39228,90456,64702,71964,35025,22424,39228,17341,53393,39228,3139,25029,5736,20045,55086,17341,60533,22424]
 * 5
 */