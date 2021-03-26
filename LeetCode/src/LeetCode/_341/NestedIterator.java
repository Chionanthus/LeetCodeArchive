//package LeetCode._341;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class NestedIterator implements Iterator<Integer> {
//
//    public List<Integer> list = new ArrayList<>();
//    private int index;
//
//    public void add(List<NestedInteger> nestedList)
//    {
//        for(NestedInteger nested :nestedList)
//        {
//            if(nested.isInteger()==true)
//            {
//                list.add(nested.getInteger());
//            }
//            else
//            {
//                add(nested.getList());
//            }
//        }
//    }
//
//    public NestedIterator(List<NestedInteger> nestedList) {
//        add(nestedList);
//    }
//
//    @Override
//    public Integer next() {
//        return list.get(index++);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index<list.size();
//    }
//}
