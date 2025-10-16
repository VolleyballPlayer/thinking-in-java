package strings;

import java.util.*;
public class Exercise2 {
    public String toString() {
        return " Exercise2 address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        List<Exercise2> v =
                new ArrayList<Exercise2>();
        for(int i = 0; i < 10; i++)
            v.add(new Exercise2());
        System.out.println(v);
    }
}
