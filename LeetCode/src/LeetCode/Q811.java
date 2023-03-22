package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String str : cpdomains){
            String[] temp = str.split(" ");
            int num = Integer.parseInt(temp[0]);
            String net= temp[1];
            int index = net.length();

            while(true)
            {
                index = net.lastIndexOf(".",index-1);
                if(index == -1 )break;
                map.put(net.substring(index+1),map.getOrDefault(net.substring(index+1),0)+num);
            }
            map.put(net,map.getOrDefault(net,0)+num);
        }

        LinkedList<String> list = new LinkedList<>();

        for(Map.Entry<String,Integer> iter : map.entrySet())
        {
            list.add(iter.getValue()+" "+iter.getKey());
        }
        return list;
    }
}
