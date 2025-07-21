package inner.classes;

class OuterA{
    OuterA(){
        System.out.println("OuterA Class");
    }
    class InnerA {
        InnerA(){
            System.out.println("InnerA Class");
        }
        class InnerAA{
            InnerAA(){
                System.out.println("InnerAA Class");
            }
        }
    }
}

class OuterB{
    OuterB(){
        System.out.println("OuterB Class");
    }
    static class InnerB {
        InnerB(){
            System.out.println("InnerB Class");
        }
        static class InnerBB{
            InnerBB(){
                System.out.println("InnerBB Class");
            }
        }
    }
}

public class Exercise19 {
    public static void main(String[] args) {
        OuterA out_A = new OuterA();
        OuterA.InnerA out_in_A = out_A.new InnerA();
        OuterA.InnerA.InnerAA out_in_in_A = out_in_A.new InnerAA();
        OuterB out_B = new OuterB();
        OuterB.InnerB out_in_B = new OuterB.InnerB();
        OuterB.InnerB.InnerBB out_in_in_B = new OuterB.InnerB.InnerBB();
    }
}
