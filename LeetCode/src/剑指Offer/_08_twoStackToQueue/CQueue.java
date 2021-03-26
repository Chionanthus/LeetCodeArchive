package 剑指Offer._08_twoStackToQueue;

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(!stack1.isEmpty())
        {
            while(!stack1.isEmpty())
            {
               stack2.add(stack1.poll()) ;
            }
            return stack2.poll();
        }
        else if(!stack2.isEmpty())return stack2.poll();
        else return -1;

    }
}
