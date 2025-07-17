package inner.classes;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
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

}

class StringHolder{
    String s;
    StringHolder(String someString){
       s = someString;
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
           sequence.add( new StringHolder(Integer.toString(i)));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        StringHolder s1 = new StringHolder("Hello");
        StringHolder s2 = new StringHolder("world");
        Sequence secondExample = new Sequence(2);
        secondExample.add(s1);
        secondExample.add(s2);
        Selector selector1 = secondExample.selector();
        while(!selector1.end()){
            System.out.print(selector1.current() + " ");
            selector1.next();
        }

    }
}
