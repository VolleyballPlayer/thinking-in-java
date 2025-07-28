package holdobjects;

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println("1: " + strings);
        String h = "d";
        strings.add(h);
        System.out.println("2: " + strings);
        System.out.println("3: " + strings.contains(h));
        strings.remove(h);
        String p = strings.get(2);
        System.out.println("4: " + p + " " + strings.indexOf(p));
        String cymric = "e";
        System.out.println("5: " + strings.indexOf(cymric));
        System.out.println("6: " + strings.remove(cymric));
        System.out.println("7: " + strings.remove(p));
        System.out.println("8: " + strings);
        strings.add(2, "f");
        System.out.println("9: " + strings);
        List<String> sub = strings.subList(1, 3);
        System.out.println("subList: " + sub);
        System.out.println("10: " + strings.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + strings.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + strings.containsAll(sub));
        List<String> copy = new ArrayList<String>(strings);
        sub = Arrays.asList(strings.get(1), strings.get(2));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(strings);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(0, "g");
        System.out.println("16: " + copy);
        copy.addAll(1, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + strings.isEmpty());
        strings.clear();
        System.out.println("19: " + strings);
        System.out.println("20: " + strings.isEmpty());
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c", "d");
        strings.addAll(list);
        System.out.println("21: " + strings);
        Object[] o = strings.toArray();
        System.out.println("22: " + o[3]);
        Object pa = strings.toArray();
    }
}
