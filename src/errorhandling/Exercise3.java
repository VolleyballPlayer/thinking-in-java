package errorhandling;

public class Exercise3 {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        try {
            System.out.println(myNum[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Array index out of bounds exception caught");
            e.printStackTrace();
        }
    }
}
