package objects;

class StaticI {
    static int i = 1;
}

class Incrementable {
    static void increment() { StaticI.i++; }
}

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticI.i);
        StaticI st1 = new StaticI();
        StaticI st2 = new StaticI();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("objects.Incrementable.increment() :");
        Incrementable.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("st1.i++ :");
        st1.i++;
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable new_incrementable = new Incrementable();
        System.out.println("objects.Incrementable.increment() :");
        new_incrementable.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        StaticI st3 = new StaticI();
        st3.i = 5;
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("st3.i = " + st3.i);
    }
}
