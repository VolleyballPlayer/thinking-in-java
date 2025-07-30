package holdobjects;

import java.util.*;

public class Exercise11 {
    static void print(Collection c){
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + "");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        print(iList);
        LinkedList<Character> ll =
                new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
        print(ll);
        HashSet<Float> hs =
                new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
        print(hs);
        TreeSet<Double> ts =
                new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
        print(ts);
        LinkedHashSet<Integer> lhs =
                new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
        print(lhs);
    }
}
