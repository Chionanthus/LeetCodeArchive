package LeetCode周赛._23_3_19;

public class evenOddBit {

    public int[] evenOddBit(int n) {
        int [] answer = new int[]{0,0};
        int count = 0;
        while(n!=0)
        {

            answer[count] += n & 1;
            n>>=1;
            count = count == 0 ? 1 : 0;
        }
        return answer;

    }
}