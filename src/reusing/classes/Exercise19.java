package reusing.classes;

import java.util.Random;

class BlankFinal{
    static final Random RAND = new Random(10);
}

public class Exercise19 {
    private final int finalInt;
    public Exercise19(){
        finalInt = BlankFinal.RAND.nextInt(100);
    }
    public static void main(String[] args) {
        Exercise19 obj = new Exercise19();
        System.out.println(obj.finalInt);
        //obj.finalInt = 3; Error - final cannot be assigned with new value
    }
}
