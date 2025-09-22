package errorhandling;

class ExceptionGG extends Exception{}

public class Exercise11 {
    private static void f(){
        try{
            g();
        } catch (ExceptionGG e){
            System.out.println("At line 11");
            //e.printStackTrace();
            throw new RuntimeException();
        }

    }
    private static void g() throws ExceptionGG{
        System.out.println("At line 18");
        throw new ExceptionGG();
    }

    public static void main(String[] args) {
        f();
    }
}
