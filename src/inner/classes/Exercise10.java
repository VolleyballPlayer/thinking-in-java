package inner.classes;

interface C{
    void methodC();
}

public class Exercise10 {
    void methodEx10(boolean b){
        if (b){
            class InnerClass10 implements C{
                @Override
                public void methodC() {
                    System.out.println("This is implementation of C");
                }
            }
            InnerClass10 obj = new InnerClass10();
            obj.methodC();

        }
    }
    public static void main(String[] args) {
        Exercise10 obj = new Exercise10();
        System.out.println("set b to true");
        obj.methodEx10(true);
        System.out.println("set b to false");
        obj.methodEx10(false);
    }
}
