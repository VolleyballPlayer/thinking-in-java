package errorhandling;

class MyException28 extends RuntimeException{
    private String msg;
    MyException28(String message){
        msg = message;
    }
    void display(){
        System.out.println(msg);
    }
}

public class Exercise28 {
    public static void f() throws MyException28{
        throw new MyException28("MyException28 thrown");
    }
    public static void main(String[] args) {
        f();
    }
}
