package holdobjects;

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<Integer>(5);
        ListIterator<Integer> it = l1.listIterator(l1.size());
        while(it.hasPrevious()){
            l2.add(it.previous());
        }
        System.out.println(l2);
    }
}
