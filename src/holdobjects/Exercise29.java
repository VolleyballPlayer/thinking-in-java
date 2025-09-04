package holdobjects;

import java.util.PriorityQueue;
import java.util.Queue;

class SimpleClass extends Object{
}

public class Exercise29 {
    public static void main(String[] args) {
        Queue<SimpleClass> q = new PriorityQueue<>();
        SimpleClass obj = new SimpleClass();
        q.offer(obj);
    }
}
