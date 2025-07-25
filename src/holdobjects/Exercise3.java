package holdobjects;
import java.util.*;

interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Exercise3 {
    private ArrayList<Object> items = new ArrayList<Object>();
    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Exercise3 sequence = new Exercise3();
        for(int i = 0; i < 11; i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
