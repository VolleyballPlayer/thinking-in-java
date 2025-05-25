package reusing.classes;

class Component11{
    Component11(){
        System.out.println("I am Component1.");
    }
    void dispose(){
        System.out.println("Disposing Component11");
    }
}

class Component22{
    Component22(){
        System.out.println("I am Component2.");
    }
    void dispose(){
        System.out.println("Disposing Component22");
    }
}

class Component33{
    Component33(){
        System.out.println("I am Component3.");
    }
    void dispose(){
        System.out.println("Disposing Component33");
    }
}

class Root1{
    Component11 component11Root;
    Component22 component22Root;
    Component33 component33Root;
    Root1(){
        System.out.println("I am Root.");
    }
    void dispose(){
        System.out.println("Disposing Root1");
    }
}

class Stem1 extends Root1{
    Component11 component11Stem;
    Component22 component22Stem;
    Component33 component33Stem;
    Stem1(){
        System.out.println("I am Stem.");
    }
    void dispose(){
        component11Stem = new Component11();
        component22Stem = new Component22();
        component33Stem = new Component33();
        component33Stem.dispose();
        component22Stem.dispose();
        component11Stem.dispose();
        System.out.println("Disposing Stem1");
        super.dispose();
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        Stem1 obj = new Stem1();
        obj.dispose();
    }
}