package inner.classes;

class Sequence4 {
    private Object[] items;
    private int next = 0;
    public Sequence4(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        public Sequence4 inner(){
            return Sequence4.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
}

public class Exercise4{
    public static void main(String[] args) {
        Sequence4 sequence = new Sequence4(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}