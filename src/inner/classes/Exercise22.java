package inner.classes;

interface Selector22 {
    boolean end();
    Object current();
    void next();
}
class Sequence22 {
    private Object[] items;
    private int next = 0;
    public Sequence22(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector22 {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector22 selector() {
        return new SequenceSelector();
    }

    private class ReverseSelector implements Selector22 {
        private int i = items.length-1;
        public boolean end() { return i == 0; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i--; }
    }
    public Selector22 reverseSelector() {
        return new ReverseSelector();
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        //Sequence22 sequence = new Sequence22(10);
        //for(int i = 0; i < 10; i++)
        //    sequence.add(Integer.toString(i));
        //Selector22 selector = sequence.selector();
        //while(!selector.end()) {
        //    System.out.print(selector.current() + " ");
        //    selector.next();
        //}
        Sequence22 reverseSequence = new Sequence22(10);
        for(int i = 0; i < 10; i++)
            reverseSequence.add(Integer.toString(i));
        Selector22 reverseSelector = reverseSequence.reverseSelector();
        while(!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
}
