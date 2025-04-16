package operators;

public class Exercise2 {
    float number = 1.11f;
    void print() {
        System.out.println(number);
    }
    public static void main (String[] args){
        Exercise2 a;
        Exercise2 b = new Exercise2();
        a = b;
        System.out.println("a number:");
        a.print();
        System.out.println("b number:");
        b.print();
        b.number = 3.33f;
        System.out.println("a number:");
        a.print();
        System.out.println("b number:");
        b.print();
    }
}
