package errorhandling;

class MyException4 extends Exception{
    private String msg;
    MyException4(String message){
        msg = message;
    }
    void display(){
        System.out.println(msg);
    }
}

public class Exercise4 {
    public static void f() throws MyException4{
        throw new MyException4("MyException4 thrown");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException4 e){
            System.out.println("MyException4 caught");
            e.printStackTrace();
            e.display();
        }
    }
}
