package reusing.classes;

class NonDefaultConstructor{
    NonDefaultConstructor(int i){
        System.out.println("This is a non-default constructor class with integer value " + i + " in default constructor");
    }
}

class BothConstructors extends NonDefaultConstructor{
    BothConstructors(){
        super(0);
        System.out.println("This is a both constructors class and its default constructor");
    }
    BothConstructors(int i){
        super(i);
        System.out.println("This is s both constructors class and its non-default constructors value " + i);
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        NonDefaultConstructor obj1 = new NonDefaultConstructor(1);
        BothConstructors obj2 = new BothConstructors();
        BothConstructors obj3 = new BothConstructors(2);
    }
}
