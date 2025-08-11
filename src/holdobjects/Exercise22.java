package holdobjects;

import java.util.*;

//class containing a String
//        and a count field to store each different word, and a Set of these objects to maintain the list

class Word{
    String s;
    int count;
    Word(String s, int count){
        this.s = s;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Word{" +
                "s='" + s + '\'' +
                ", count=" + count +
                '}';
    }
}
public class Exercise22 {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        Collections.addAll(words, "A", "B", "C", "Collections", "D", "E", "F", "G", "H", "HashSet", "I", "J",
                "K", "L", "M", "N", "Output", "Print", "Set", "SetOperations", "String", "X", "Y", "Z", "add", "addAll",
                "added", "args", "class", "contains", "containsAll", "false", "from", "holding", "import", "in", "java",
                "main", "mindview", "net", "new", "print", "public", "remove", "removeAll", "removed", "set1", "set2",
                "split", "static", "to", "true", "util", "void", "G");
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Set<Word> counter = new HashSet<Word>();
        for (String word: words) {
            int count=0;
            for(int i = 0; i < words.size(); i++) {
                if(word.equals(words.get(i))) count++;
            }
            Word wordObject = new Word(word, count);
            counter.add(wordObject);
        }
        System.out.println(counter);
    }
}
