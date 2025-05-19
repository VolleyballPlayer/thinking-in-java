package reusing.classes;

class Component1{
    Component1(){
        System.out.println("I am Component1.");
    }
}

class Component2{
    Component2(){
        System.out.println("I am Component2.");
    }
}

class Component3{
    Component3(){
        System.out.println("I am Component3.");
    }
}

class Root{
    Component1 component1Root;
    Component2 component2Root;
    Component3 component3Root;
    Root(){
        System.out.println("I am Root.");
    }
}

class Stem extends Root{
    Component1 component1Stem;
    Component2 component2Stem;
    Component3 component3Stem;
    Stem(){
        System.out.println("I am Stem.");
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        Stem obj = new Stem();
    }
}
