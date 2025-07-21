package inner.classes;

interface InterfaceNestedStatic{
    void method1();
    void method2();
    class NestedClass{
        static void displayResults(InterfaceNestedStatic i){
            i.method1();
            i.method2();
        }
    }
}
public class Exercise21 implements InterfaceNestedStatic{
    @Override
    public void method1() {
        System.out.println("This is method1 in Exercise21");
    }

    @Override
    public void method2() {
        System.out.println("This is method2 in Exercise21");
    }

    public static void main(String[] args) {
        Exercise21 obj = new Exercise21();
        NestedClass.displayResults(obj);
    }
}
