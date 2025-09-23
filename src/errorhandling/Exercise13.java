package errorhandling;


class ExceptionAA extends Exception{
    ExceptionAA(){
        System.out.println("ExceptionAA is thrown");
    }
}

class ExceptionBB extends Exception{
    ExceptionBB(){
        System.out.println("ExceptionBB is thrown");
    }
}

class ExceptionCC extends Exception{
    ExceptionCC(){
        System.out.println("ExceptionCC is thrown");
    }
}

public class Exercise13 {
    public static void a() throws ExceptionAA {
        throw new ExceptionAA();
    }
    public static void b() throws ExceptionBB {
        throw new ExceptionBB();
    }
    public static void c() throws NullPointerException {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            //a();
            //b();
            c();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Executing finally block");
        }
    }
}