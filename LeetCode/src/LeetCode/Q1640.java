package LeetCode;

public class Q1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        outer:
        for(int i=0;i<arr.length;)
        {
            for(int j = 0;j<pieces.length;j++)
            {
                if(pieces[j][0]==arr[i])
                {
                    for (int k = 0; k < pieces[j].length; k++) {
                        if(pieces[j][k]==arr[i]) {
                            i++;
                        }
                        else return false;
                    }
                    continue outer;
                }

            }
            // 如果把j遍历完都没有
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q1640 solution =new Q1640();
        solution.canFormArray(new int []{91,4,64,78},new int[][] {{78},{4,64},{91}});
    }
}
