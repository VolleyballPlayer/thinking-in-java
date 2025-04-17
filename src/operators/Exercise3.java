package operators;

class Float {
    float number;
}
public class Exercise3 {
    static void f(Float x){
        x.number = 1.11f;
    }
    public static void main(String[] args){
        Float y = new Float();
        y.number = 2.22f;
        System.out.println(y.number);
        f(y);
        System.out.println(y.number);
    }
}
