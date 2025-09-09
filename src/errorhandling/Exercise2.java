package errorhandling;

class ClassForReference{
    void f(){
        System.out.println("This is method f()");
    }

}
public class Exercise2 {
    public static void main(String[] args) {
        ClassForReference obj = null;
        try{
            obj.f();
        } catch (NullPointerException e) {
            System.err.println("It is not possible to call method f() as object is not initialised.");
            e.printStackTrace();
        }
    }
}
