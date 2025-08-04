package holdobjects;
import java.util.*;

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T v) { storage.addFirst(v); }
    public T peek() { return storage.getFirst(); }
    public T pop() { return storage.removeFirst(); }
    public boolean empty() { return storage.isEmpty(); }
    public String toString() { return storage.toString(); }
}

public class Exercise15 {
    public static void main(String[] args) {
        String s = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-";
        LinkedList<String> l = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            l.add(String.valueOf(s.charAt(i)));
        }

        ListIterator<String> it = l.listIterator();

        while(it.hasNext()){
            String next = it.next();
            if (next.equals("+")){
                stack.push(it.next());
            } else if (next.equals("-")) {
                System.out.println(stack.pop());
            }
        }

    }
}
