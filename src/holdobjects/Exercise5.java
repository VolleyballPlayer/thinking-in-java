package holdobjects;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        System.out.println("1: " + ints);
        Integer h = 4;
        ints.add(h);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(h));
        ints.remove(h);
        Integer p = ints.get(2);
        System.out.println("4: " + p + " " + ints.indexOf(p));
        Integer cymric = 5;
        System.out.println("5: " + ints.indexOf(cymric));
        System.out.println("6: " + ints.remove(cymric));
        System.out.println("7: " + ints.remove(p));
        System.out.println("8: " + ints);
        ints.add(2, 6);
        System.out.println("9: " + ints);
        List<Integer> sub = ints.subList(1, 3);
        System.out.println("subList: " + sub);
        System.out.println("10: " + ints.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + ints.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + ints.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(ints);
        sub = Arrays.asList(ints.get(1), ints.get(2));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(ints);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(0, 7);
        System.out.println("16: " + copy);
        copy.addAll(1, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + ints.isEmpty());
        ints.clear(); // Remove all elements
        System.out.println("19: " + ints);
        System.out.println("20: " + ints.isEmpty());
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4);
        ints.addAll(list);
        System.out.println("21: " + ints);
        Object[] o = ints.toArray();
        System.out.println("22: " + o[3]);
        Object pa = ints.toArray();
    }
}
