package holdobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise9 {
    private ArrayList<Object> items = new ArrayList<Object>();
    public void add(Object x) {
        items.add(x);
    }

    public static void main(String[] args) {
        Exercise9 sequence = new Exercise9();
        for(int i = 0; i < 11; i++)
            sequence.add(i);
        Iterator<Object> it = sequence.items.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
