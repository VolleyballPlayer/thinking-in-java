package errorhandling;

public class Exercise15 {
    static Switch sw = new Switch();
    private static Integer[] x = new Integer[1];
    public static void f(int i)
            throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            f(x[0]);
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            System.out.println("Inside finally block");
            sw.off();
        }
    }
}
