package strings;
import java.util.Formatter;

public class Exercise5 {
    private static int d = 1;
    private static char c = '$';
    private static boolean b = true;
    private static String s = "some_string";
    private static float f = 1.2f;
    private static double e = 1.3e+10;
    private static int x = 0x1a;
    public static void main(String[] args) {
        Formatter f = new Formatter();
        //System.out.println(f.format("1) %d 2) %c 3) %b 4) %s 7) %x", d, d, d, d, d));
        //System.out.println(f.format("2) %c 3) %b 4) %s", c, c, c));
        //System.out.println(f.format("3) %b 4) %s", b, b));
        //System.out.println(f.format("3) %b 4) %s", s, s));
        //System.out.println(f.format("3) %b 4) %s", f, f));
        //System.out.println(f.format("3) %b 4) %s 5) %f 6) %e", e, e, e, e));
        System.out.println(f.format("2) %c 3) %b 4) %s 7) %x", x, x, x, x));
    }
}
