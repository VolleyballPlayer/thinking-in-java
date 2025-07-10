package interfaces;

interface ParentInterface{void logParent();}
interface ChildInterface1 extends ParentInterface{void logChild1();}
interface ChildInterface2 extends ParentInterface{void logChild2();}
interface Grandchild extends ChildInterface1, ChildInterface2{void logGrandChild();}

public class Exercise13 implements Grandchild{
    public void logGrandChild(){
        System.out.println("Logging GrandChild");
    }
    public void logChild1(){
        System.out.println("Logging Child1");
    }
    public void logChild2(){
        System.out.println("Logging Child2");
    }
    public void logParent(){
        System.out.println("Logging Parent");
    }

    public static void main(String[] args) {
        Exercise13 obj = new Exercise13();
        obj.logParent();
        obj.logChild1();
        obj.logChild2();
        obj.logGrandChild();
    }
}