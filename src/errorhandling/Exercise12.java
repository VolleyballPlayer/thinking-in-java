package errorhandling;


interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Exercise12 {
    private Object[] items;
    private int next = 0;
    public Exercise12(int size) { items = new Object[size]; }
    public void add(Object x) throws ArrayIndexOutOfBoundsException{
        if(next < items.length)
            items[next++] = x;
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Exercise12 sequence = new Exercise12(10);
        for(int i = 0; i < 11; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
