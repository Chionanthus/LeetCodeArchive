package LeetCode;

public class Q1694_简单模拟题 {
    public String reformatNumber(String number) {
        number = number.replace(" ","").replace("-","");
        StringBuilder sb = new StringBuilder();
        int n = number.length();
        int i=0;
        while(n>4)
        {
            sb.append(number.substring(i,i+3));
            sb.append('-');
            i+=3;
            n-=3;
        }
        if (n==4)
        {
            return sb.append(number.substring(i,i+2)).append('-').append(number.substring(i+2,i+4)).toString();
        }
        else return sb.append(number.substring(i)).toString();

    }


    public static void main(String[] args) {
        Q1694_简单模拟题 solution = new Q1694_简单模拟题();
        System.out.println(solution.reformatNumber("--17-5 229 35-39475"));
    }
}
