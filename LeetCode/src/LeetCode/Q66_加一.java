package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;

public class Q66_加一 {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        BigInteger bigInt =new BigInteger(sb.toString());
        bigInt = bigInt.add(BigInteger.valueOf(1));


        LinkedList<Integer> list = new LinkedList<>();

        while(!bigInt.equals(BigInteger.ZERO))
        {
            BigInteger[] bis = bigInt.divideAndRemainder(BigInteger.TEN);
            list.addFirst(bis[1].intValue());
            bigInt=bis[0];
        }

        int[] ret = new int[list.size()];
        for (int i =0;i< ret.length;i++){
            ret[i]=list.get(i);
        }

        return ret;
    }
}
