package holdobjects;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(6,7,8,9));
        ListIterator<Integer> it = l2.listIterator();
        while(it.hasNext()){
            int middle = Math.round(l.size() / 2);
            l.add(middle, it.next());
            System.out.println(l);
        }
    }
}
