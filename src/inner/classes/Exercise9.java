package inner.classes;

interface A{
    void methodA();
}

public class Exercise9 {
    A methodEx9(){
        class InnerClass implements A{
            @Override
            public void methodA() {
                System.out.println("This is implementation of A");
            }
        }
        return new InnerClass();
    }
    public static void main(String[] args) {
        Exercise9 obj = new Exercise9();
        A obj2 = obj.methodEx9();
        obj2.methodA();
    }
}
