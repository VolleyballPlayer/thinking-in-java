package holdobjects;

import java.util.*;

public class Exercise26 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        Collections.addAll(words, "A", "B", "C", "Collections", "D", "E", "F", "G", "H", "HashSet", "I", "J",
                "K", "L", "M", "N", "Output", "Print", "Set", "SetOperations", "String", "X", "Y", "Z", "add", "addAll",
                "added", "args", "class", "contains", "containsAll", "false", "from", "holding", "import", "in", "java",
                "main", "mindview", "net", "new", "print", "public", "remove", "removeAll", "removed", "set1", "set2",
                "split", "static", "to", "true", "util", "void");
        Map<String, ArrayList<Integer>> m = new HashMap<>();
        Iterator<String> it = words.iterator();
        int count=0;
        while(it.hasNext()){
            count++;
            String word = it.next();
            ArrayList<Integer> element = m.get(word);
            if (element == null){
                element = new ArrayList<>(List.of(count));
            } else {
                element.add(count);
            }
            m.put(word, element);
        }
        System.out.println(m);
        Set<Map.Entry<String, ArrayList<Integer>>> me = new LinkedHashSet<>(m.entrySet());
        Iterator<Map.Entry<String, ArrayList<Integer>>> itReverse = me.iterator();
        Map<Integer, String> mapReversed = new TreeMap<>();
        while(itReverse.hasNext()){
            Map.Entry<String, ArrayList<Integer>> element = itReverse.next();
            mapReversed.put(element.getValue().getFirst(), element.getKey());
        }
        System.out.println(mapReversed);
    }
}
