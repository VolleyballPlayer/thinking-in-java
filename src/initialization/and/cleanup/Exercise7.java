package initialization.and.cleanup;

class NoDefaultConstructor{
    void print(){
        System.out.println("No default constructor.");
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        NoDefaultConstructor obj = new NoDefaultConstructor();
        obj.print();
    }
}
