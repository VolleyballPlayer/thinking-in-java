package holdobjects;

import java.util.*;

public class Exercise24 {
    public static void main(String[] args) {
        Map<String, String> m = new LinkedHashMap<String, String>();
        m.put("a", "A");
        m.put("c", "C");
        m.put("b", "B");

        SortedSet<String> sorted = new TreeSet<>(m.keySet());
        Map<String, String> mSorted = new LinkedHashMap<String, String>();

        Iterator<String> it = sorted.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            mSorted.put(key, value);
        }
        System.out.println(mSorted);
    }
}
