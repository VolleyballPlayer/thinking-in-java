package errorhandling;

class ExceptionF extends Exception{}
class ExceptionG extends Exception{}

public class Exercise10 {
    private static void f(){
        try{
            try{
                g();
            } catch (ExceptionG e){
                System.out.println("At line 12");
                e.printStackTrace();
                throw new ExceptionF();
            }
        } catch(ExceptionF e){
            System.out.println("Between 2 print stacks");
            e.printStackTrace();
        }

    }
    private static void g() throws ExceptionG{
        System.out.println("At line 22");
        throw new ExceptionG();
    }

    public static void main(String[] args) {
        f();
    }
}
