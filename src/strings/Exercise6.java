package strings;

public class Exercise6 {
    private static int i = 1345;
    private static long l = 1L;
    private static float f = 1.1f;
    private static double d = 1.1d;

    public String toString() {
        return String.format("%08d, %-10d, %+20f, %0100.2f", this.i, this.l, this.f, this.d);
    }

    public static void main(String[] args) {
        Exercise6 s = new Exercise6();
        System.out.println(s);
    }
}
