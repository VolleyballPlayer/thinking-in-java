package holdobjects;

import java.util.*;

public class Exercise25 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        Collections.addAll(words, "A", "B", "C", "Collections", "D", "E", "F", "G", "H", "HashSet", "I", "J",
                "K", "L", "M", "N", "Output", "Print", "Set", "SetOperations", "String", "X", "Y", "Z", "add", "addAll",
                "added", "args", "class", "contains", "containsAll", "false", "from", "holding", "import", "in", "java",
                "main", "mindview", "net", "new", "print", "public", "remove", "removeAll", "removed", "set1", "set2",
                "split", "static", "to", "true", "util", "void");
        Map<String, ArrayList<Integer>> m = new HashMap<String, ArrayList<Integer>>();
        Iterator<String> it = words.iterator();
        int count=0;
        while(it.hasNext()){
            count++;
            String word = it.next();
            ArrayList<Integer> element = m.get(word);
            if (element == null){
                element = new ArrayList<Integer>(Arrays.asList(count));
            } else {
                element.add(count);
            }
            m.put(word, element);
        }
        System.out.println(m);
    }
}
