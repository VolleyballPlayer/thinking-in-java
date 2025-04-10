package objects;

import java.util.*;

/**
 * You can even insert a list:
 * <ol>
 * <li> Item one
 * <li> Item two
 * <li> Item three
 * </ol>

 * Another test list
 * <ol>
 * <li> One
 * <li> Two
 * <li> Three
 * </ol>
 */

public class Exercise14 {

    /** Let's try a public field list
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    public int i = 2;

    /**
     * A private field list (-private to see)
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    private final int j = 3;

    /**
     * Another list can be inserted here to help explain the
     * following method call
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol><br>
     * but may be formatted differently in Method Summary
     */

    public static void main(String[] args) {

        /*
          Let's try another test list here
          <ol>
          <li> One
          <li> Two
          <li> Three
          </ol>
         */
        Date d = new Date();
        System.out.println("d = " + d);
        Exercise14 obj = new Exercise14();
        System.out.println(obj.j);

    }
}