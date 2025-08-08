package holdobjects;

import java.util.*;


public class Exercise20 {
    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "a e i o u A E I O U".split(" "));
        Set<String> words = new HashSet<>();
        Collections.addAll(words, "A", "B", "C", "Collections", "D", "E", "F", "G", "H", "HashSet", "I", "J",
                "K", "L", "M", "N", "Output", "Print", "Set", "SetOperations", "String", "X", "Y", "Z", "add", "addAll",
                "added", "args", "class", "contains", "containsAll", "false", "from", "holding", "import", "in", "java",
                "main", "mindview", "net", "new", "print", "public", "remove", "removeAll", "removed", "set1", "set2",
                "split", "static", "to", "true", "util", "void");

        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String word: words) {
            for (char c: word.toCharArray()) {
                String cAsString = String.valueOf(c);
                if (vowels.contains(cAsString)){
                    Integer count = countMap.get(cAsString);
                    countMap.put(cAsString, count == null ? 1 : count + 1);
                }
            }
        }
        System.out.println(countMap);
    }
}