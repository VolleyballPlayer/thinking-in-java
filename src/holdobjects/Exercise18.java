package holdobjects;

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("First", 1);
        myMap.put("Second", 2);
        myMap.put("Third", 3);
        myMap.put("Fourth", 4);
        System.out.println(myMap);

        Set<String> sortedKeys = new TreeSet<String>(myMap.keySet());
        Map<String, Integer> myLinkedMap = new LinkedHashMap<String, Integer>();

        Iterator it = sortedKeys.iterator();
        while (it.hasNext()){
            String s = it.next().toString();
            Integer i = myMap.get(s);
            myLinkedMap.put(s, i);
        }
        System.out.println(myLinkedMap);
    }
}
