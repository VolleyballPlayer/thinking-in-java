package polymorphism;

class BaseClass{
    void first_method(){
        //this.second_method();
        second_method();
    }
    void second_method(){
        System.out.println("Second method of base class");
    }
}

class DerivedClass extends BaseClass{
    @Override
    void second_method() {
        System.out.println("Second method of derived class");
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        BaseClass d = new DerivedClass();
        d.first_method();
    }
}
