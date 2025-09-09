package errorhandling;

class MyException extends Exception{
    public MyException(String message){
        super(message);
        System.out.println("MyException(" + message + ")");
    }
}

public class Exercise1 {
    public static void f() throws MyException{
        throw new MyException("Throwing MyException from f()");
    }
    public static void main(String[] args) throws Exception {
        try{
            f();
        } catch (MyException e){
            e.printStackTrace();
        } finally {
            System.out.println("I am in the finally block");
        }
    }
}
