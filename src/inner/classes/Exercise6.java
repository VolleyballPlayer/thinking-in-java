package inner.classes;


import inner.classes.ex6.SomeInterface;
import inner.classes.ex6_2.Implementor;

public class Exercise6 extends Implementor {
    SomeInterface someMethod(){
        return this.new InnerClass();
    }

    public static void main(String[] args) {
        Exercise6 obj = new Exercise6();
        obj.someMethod().print();
    }
}
