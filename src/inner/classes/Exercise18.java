package inner.classes;

public class Exercise18 {
    public static class A{
        static int i;
        A() {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
       A obj = new A();
    }
}
