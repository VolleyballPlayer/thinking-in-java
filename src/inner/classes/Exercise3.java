package inner.classes;

class Outer3{
    private String s;
    Outer3(String someString){
        s = someString;
    }
    class Inner3 {
        @Override
        public String toString() {
            return s;
        }
    }
    Inner3 createInner() {
        return new Inner3();
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        Outer3 obj = new Outer3("some string");
        Outer3.Inner3 inner_obj = obj.createInner();
        System.out.println(inner_obj.toString());
    }
}
