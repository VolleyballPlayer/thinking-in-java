package access.control.exercise4;

public class MyStatic {

    private static String Cat = "olha";
    private String Dog = "jorge";

    public static void main(String[] args) {
        MyStatic my_animal = new MyStatic();
        System.out.println(Cat + " and " + MyStatic.Cat);
        System.out.println(my_animal.Dog + " and " + Cat);


    }

    protected void myProtectedChild() {
        //do something
    }
}
