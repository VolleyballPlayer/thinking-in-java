package operators;

class Velocity {
    static float calculate(float s, float t){
        return s / t;
    }
}
public class Exercise4 {
    public static void main (String[] args) {
        float v1 = Velocity.calculate(8, 4);
        System.out.println(v1);
        float v2 = Velocity.calculate(15, 2);
        System.out.println(v2);
    }
}
