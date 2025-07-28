package holdobjects;

import java.util.*;

class Generator {
    int key = 0;
    public String next() {
        switch(key) {
            default:
            case 0 : key++; return "Chewbacca";
            case 1 : key++; return "Yoda";
            case 2 : key++; return "Leia";
            case 3 : key = 0; return "R2-D2";
        }
    }
    public void fillA(String[] a) {
        for(int i = 0; i < a.length; i++)
            a[i] = next();
    }
    public Collection fill(Collection<String> c, int n) {
        for(int i = 0; i < n; i++) c.add(next());
        return c;
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fillA(a);
        for(String s : a) System.out.print(s + ", ");
        System.out.println();
        System.out.println(gen.fill(new ArrayList<String>(), 10));
        System.out.println(gen.fill(new LinkedList<String>(), 10));
        System.out.println(gen.fill(new HashSet<String>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gen.fill(new TreeSet<String>(), 10));
    }
}