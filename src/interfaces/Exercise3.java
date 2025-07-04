package interfaces;

abstract class Printer{
    Printer(){
        print();
    }
    abstract void print();
}

class DerivedPrinter extends Printer{
    int i = 1;
    void print(){
        System.out.println(i);
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        DerivedPrinter obj = new DerivedPrinter();
        obj.print();
    }
}
