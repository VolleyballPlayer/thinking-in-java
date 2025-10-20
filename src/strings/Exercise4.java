package strings;
import java.util.*;

public class Exercise4 {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static int i1 = 15;
    private static int i2 = 5;
    private static int i3 = 10;
    private static double d1 = 5d;
    private static float f1 = 10.2f;
    private String s1 = "%-" + i1 + "s %" + i2 + "s %" + i3 + "s\n";
    private String s2 = "%-" + i1 + ".15s %" + i2 + "d %" + i3 + ".2f \n";
    private String s3 = "%-" + i1 + "s %" + i2 + "s %" + i3 + ".2f\n";
    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format(s2, name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format(s3, "Tax", "", total*0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "", total * 1.06);
    }
    public static void main(String[] args) {
        Exercise4 receipt = new Exercise4();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}