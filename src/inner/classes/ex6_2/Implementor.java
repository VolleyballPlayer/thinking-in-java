package inner.classes.ex6_2;


import inner.classes.ex6.SomeInterface;

public class Implementor {
    protected class InnerClass implements SomeInterface {
        public void print(){
            System.out.println("This is InnerClass");
        }
    }
}
