package errorhandling;

public class Exercise5 {
    public static void main(String[] args) {
        int[] integerArray = new int[2];
        int i = 5;
        while (true) {
            try {
                integerArray[i] = 1;
                System.out.println("Exiting while loop at i = " + i);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                i--;
                System.out.println("Exception caught for i = " + i);
            }
        }
    }
}
