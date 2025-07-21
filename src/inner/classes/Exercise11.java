package inner.classes;

import inner.classes.ex11.Interface11;

class Subclass{
    private class InnerClass11 implements Interface11 {
        @Override
        public void print() {
            System.out.println("This is InnerClass11");
        }
    }
    Interface11 method1(){
        return new InnerClass11();
    }
}


public class Exercise11 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.method1().print();
        //((InnerClass11)obj.method1()).print();
        //cannot resolve symbol InnerClass11
    }
}
