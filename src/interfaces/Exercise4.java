package interfaces;

abstract class NoMethods{}

class DerivedNoMethods extends NoMethods{
    void someMethod(){
        System.out.println("This is some method in DerivedNoMethods.");
    }
}

abstract class AbstractMethod{
    abstract void someMethod();
}

class DerivedAbstractMethod extends AbstractMethod{
    @Override
    void someMethod(){
        System.out.println("This is some method in DerivedAbstractMethod.");
    }
}

public class Exercise4 {
    static void staticMethod(NoMethods obj){
        ((DerivedNoMethods)obj).someMethod();
    }
    static void staticMethodNoDowncase(AbstractMethod obj){
        obj.someMethod();
    }
    public static void main(String[] args) {
        DerivedNoMethods derived = new DerivedNoMethods();
        Exercise4.staticMethod(derived);
        DerivedAbstractMethod derivedAbstractMethod = new DerivedAbstractMethod();
        Exercise4.staticMethodNoDowncase(derivedAbstractMethod);

    }
}
