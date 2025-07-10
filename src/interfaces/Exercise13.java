package interfaces;

interface Parent{void logParent();}
interface Child1 extends Parent{void logChild1();}
interface Child2 extends Parent{void logChild2();}
interface Grandchild extends Child1, Child2{void logGrandChild();}

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