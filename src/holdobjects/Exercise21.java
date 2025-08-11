package holdobjects;

import java.util.*;

public class Exercise21 {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        Collections.addAll(words, "A", "B", "C", "Collections", "D", "E", "F", "G", "H", "HashSet", "I", "J",
                "K", "L", "M", "N", "Output", "Print", "Set", "SetOperations", "String", "X", "Y", "Z", "add", "addAll",
                "added", "args", "class", "contains", "containsAll", "false", "from", "holding", "import", "in", "java",
                "main", "mindview", "net", "new", "print", "public", "remove", "removeAll", "removed", "set1", "set2",
                "split", "static", "to", "true", "util", "void");
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> countMap = new LinkedHashMap<String, Integer>();
        for (String word: words) {
            Integer count = countMap.get(word);
            countMap.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(countMap);
    }
}
