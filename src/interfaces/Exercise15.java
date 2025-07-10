package interfaces;

interface I1_Ex15{
    void methodI1_1();
    void methodI1_2();
}
interface I2_Ex15{
    void methodI2_1();
    void methodI2_2();
}
interface I3_Ex15{
    void methodI3_1();
    void methodI3_2();
}
interface Aggregate_Ex15 extends I1_Ex15, I2_Ex15, I3_Ex15{
    void methodAggregate();
}

abstract class SomeClassEx15{
    SomeClassEx15(){
        System.out.println("This is SomeClassEx15 constructor");
    }
}

public class Exercise15 extends SomeClassEx15 implements Aggregate{
    public void methodAggregate(){
        System.out.println("This is aggregate method");
    }
    public void methodI1_1(){
        System.out.println("This is methodI1_1");
    }
    public void methodI1_2(){
        System.out.println("This is methodI1_2");
    }
    public void methodI2_1(){
        System.out.println("This is methodI2_1");
    }
    public void methodI2_2(){
        System.out.println("This is methodI2_2");
    }
    public void methodI3_1(){
        System.out.println("This is methodI3_1");
    }
    public void methodI3_2(){
        System.out.println("This is methodI3_2");
    }
    static void m1(I1 i1){
        i1.methodI1_1();
        i1.methodI1_2();
    }
    static void m2(I2 i2){
        i2.methodI2_1();
        i2.methodI2_2();
    }
    static void m3(I3 i3){
        i3.methodI3_1();
        i3.methodI3_2();
    }
    static void m4(Aggregate a){
        a.methodAggregate();
    }

    public static void main(String[] args) {
        Exercise15 obj = new Exercise15();
        m1(obj);
        m2(obj);
        m3(obj);
        m4(obj);
    }
}
