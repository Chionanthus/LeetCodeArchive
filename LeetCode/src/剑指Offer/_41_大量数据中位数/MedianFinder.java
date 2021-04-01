package 剑指Offer._41_大量数据中位数;

import java.util.PriorityQueue;

public class MedianFinder {
    /** initialize your data structure here. */
    PriorityQueue<Integer> bigheap;
    PriorityQueue<Integer> smallheap;
    public MedianFinder() {
        bigheap=new PriorityQueue<>((x,y)->(y-x));//改为大根堆
        smallheap=new PriorityQueue<>();//java PriorityQueue默认是小顶堆
    }

    public void addNum(int num) {
        if(bigheap.size()==smallheap.size())
        {
            bigheap.add(num);
            smallheap.add(bigheap.poll());
        }
        else
        {
            smallheap.add(num);
            bigheap.add(smallheap.poll());
        }
    }

    public double findMedian() {

        if(smallheap.size()==bigheap.size())
        {
            return (smallheap.peek()+ bigheap.peek())/2.0;
        }
        else return smallheap.peek();
    }

    public static void main(String[] args) {
        MedianFinder medianFinder=new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */