package objects;

import java.util.*;

/**
 * <pre>
 * Uses
 * System.out.println(new Date());
 * </pre>
 */

public class Exercise13_2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Date = " + d);
    }
    public static void main(String[] args){
        Exercise13_2 obj = new Exercise13_2();
        obj.showDate();
    }
}



