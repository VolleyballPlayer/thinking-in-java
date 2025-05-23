package objects;// initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

/** creates type objects.Tree wth two constructors and one info method
 */

class Tree {
    int height;

    /** no-argument constructor
     * assigns height = 0
     */

    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /** constructor taking an int argument,
     * assigns height that int argument
     */

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new tree that is " + height + " feet tall");
    }

    /** method to print height of tree object
     */

    void info() {
        System.out.println("objects.Tree is " + height + " feet tall");
    }

    /** overloaded method to print string argument
     * and height of a tree object
     */

    void info(String s) {
        System.out.println(s + ": objects.Tree is " + height + " feet tall");
    }
}

/** class to test construction of tree objects
 */

public class Exercise16 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
            t.info("some more info");
        }
        // Overloaded constructor:
        new Tree();
    }
}