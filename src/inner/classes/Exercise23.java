package inner.classes;

interface U{
    void method1();
    void method2();
    void method3();
}

class AA{
    U methodA(){
        return new U(){
            @Override
            public void method1() {
                System.out.println("method1");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        };
    }
}

class B{
    U[] arrayU;
    B(int i) {
        arrayU = new U[i];
    }
    void storeU(U u, int i) {
        arrayU[i] = u;
    }
    void setToNull(int i){
        arrayU[i] = null;
    }
    void moveThroughU(){
        for(U element: arrayU){
            element.method1();
            element.method2();
            element.method3();
        }
    }
}

public class Exercise23 {
    public static void main(String[] args) {
        AA a0 = new AA();
        AA a1 = new AA();
        B b = new B(2);
        b.storeU(a0.methodA(), 0);
        b.storeU(a1.methodA(), 1);
        b.moveThroughU();
        b.setToNull(1);
    }
}
