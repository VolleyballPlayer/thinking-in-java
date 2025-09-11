package errorhandling;

class ThrowMyException4{
    void f() throws MyException4 {
        throw new MyException4("This is MyException4");
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        try{
            ThrowMyException4 t = new ThrowMyException4();
            t.f();
        } catch(MyException4 e){
            System.err.println("MyException4 is caught");
            e.printStackTrace();
        }
    }
}
