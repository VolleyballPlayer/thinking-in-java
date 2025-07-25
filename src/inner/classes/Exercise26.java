package inner.classes;

class WithInner{
    class Inner{
        Inner(int i){
            System.out.println(i);
        }
    }
}

public class Exercise26 {
    class InheritInner extends WithInner.Inner{
        InheritInner(WithInner wi, int i2){
            wi.super(i2);
        }
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        Exercise26 e = new Exercise26();
        InheritInner ii = e.new InheritInner(wi, 1);
    }
}
