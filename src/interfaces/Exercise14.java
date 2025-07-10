package interfaces;

interface I1{
    void methodI1_1();
    void methodI1_2();
}
interface I2{
    void methodI2_1();
    void methodI2_2();
}
interface I3{
    void methodI3_1();
    void methodI3_2();
}
interface Aggregate extends I1, I2, I3{
    void methodAggregate();
}

class SomeClass{
    SomeClass(){
        System.out.println("This is SomeClass constructor");
    }
}

public class Exercise14 extends SomeClass implements Aggregate{
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
        Exercise14 obj = new Exercise14();
        m1(obj);
        m2(obj);
        m3(obj);
        m4(obj);
    }
}
