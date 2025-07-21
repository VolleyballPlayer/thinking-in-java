package inner.classes;

interface A13{
    void methodA13();
}

public class Exercise13 {
    A13 methodEx13(){
        return new A13() {
            @Override
            public void methodA13() {
                System.out.println("This is implementation of A13");
            }
        };
    }
    public static void main(String[] args) {
        Exercise13 obj = new Exercise13();
        A13 obj2 = obj.methodEx13();
        obj2.methodA13();
    }
}
