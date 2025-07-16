package inner.classes;

class Outer{
    static class Inner{
        Inner(){
            System.out.println("Inner class initialization.");}
    }
    Inner createInner(){
        return new Inner();
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner_obj = obj.createInner();
    }

}
