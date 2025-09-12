package errorhandling;

class ExceptionA extends Exception{
    ExceptionA(){
        System.out.println("ExceptionA is thrown");
    }
}

class ExceptionB extends Exception{
    ExceptionB(){
        System.out.println("ExceptionB is thrown");
    }
}

class ExceptionC extends Exception{
    ExceptionC(){
        System.out.println("ExceptionC is thrown");
    }
}

public class Exercise9 {
    public static void a() throws ExceptionA {
        throw new ExceptionA();
    }
    public static void b() throws ExceptionB {
        throw new ExceptionB();
    }
    public static void c() throws ExceptionC {
        throw new ExceptionC();
    }
    public static void main(String[] args) {
        try {
            a();
            b();
            c();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
