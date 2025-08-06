package holdobjects;

import java.util.*;


public class Exercise16 {
    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "a e i o u A E I O U".split(" "));
        Set<String> words = new HashSet<>();
        Collections.addAll(words, "A", "B", "C", "Collections", "D", "E", "F", "G", "H", "HashSet", "I", "J",
                "K", "L", "M", "N", "Output", "Print", "Set", "SetOperations", "String", "X", "Y", "Z", "add", "addAll",
                "added", "args", "class", "contains", "containsAll", "false", "from", "holding", "import", "in", "java",
                "main", "mindview", "net", "new", "print", "public", "remove", "removeAll", "removed", "set1", "set2",
                "split", "static", "to", "true", "util", "void");

        int countAll = 0;
        for (String word: words) {
            int count = 0;
            for (char c: word.toCharArray()) {
                if (vowels.contains(String.valueOf(c))){
                    count++;
                    countAll++;
                }
            }
            System.out.println(word + ": " + count + ", ");
        }
        System.out.println("Number of all vowels: " +  countAll);
    }
}