package 剑指Offer;

public class Q58II {
    public String reverseWords(String s) {
        char[] c = s.trim().toCharArray();

        reverse(c,0,c.length-1);
        int i=0,j=0;
        while(j<c.length)
        {
            while(i<c.length&&c[i]==' ')i++;
            j=i;
            while(j<c.length&&c[j]!=' ')j++;
            reverse(c,i,j-1);

            i=j;
        }

        i=0;j=0;

        while(j<c.length)
        {
            while(j<c.length&&c[j]==' ')j++;
            while(j<c.length&&c[j]!=' ')c[i++]=c[j++];
            while(j<c.length&&c[j]==' ')j++;
            if(j<c.length)c[i++]=' ';
        }
        return new String(c).substring(0,i);
    }


    public void reverse(char[]c,int begin,int end)
    {
        char temp;
        while(begin<end)
        {
            temp = c[begin];
            c[begin] =c[end];
            c[end]= temp;
            begin++;
            end--;
        }
    }

}
