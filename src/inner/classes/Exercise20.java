package inner.classes;

interface InterfaceWithNestedClass{
    class NestedClass{
        NestedClass(){
            System.out.println("This is Nested Class");
        }
    }
}
public class Exercise20 implements InterfaceWithNestedClass {
    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
    }
}
