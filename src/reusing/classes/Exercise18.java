package reusing.classes;

import java.util.Random;

class FinalVsStaticFinal{
    private static final Random RAND = new Random(10);
    static final int STATIC_FINAL = RAND.nextInt(100);
    final int finalInt = RAND.nextInt(100);

    public String toString(){return "STATIC FINAL is " + STATIC_FINAL + ", finalInt is " +  finalInt;}
}
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("First object:");
        FinalVsStaticFinal obj1 = new FinalVsStaticFinal();
        System.out.println(obj1);
        System.out.println("Second object:");
        FinalVsStaticFinal obj2 = new FinalVsStaticFinal();
        System.out.println(obj2);

    }
}
