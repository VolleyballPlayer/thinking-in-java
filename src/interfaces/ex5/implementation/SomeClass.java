package interfaces.ex5.implementation;

import interfaces.ex5.definition.SomeInterface;

public class SomeClass implements SomeInterface {
    @Override
    public void methodOne() {
        System.out.println("methodOne");
    }

    @Override
    public void methodTwo() {
        System.out.println("methodTwo");
    }

    @Override
    public void methodThree() {
        System.out.println("methodThree");
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.methodOne();
        someClass.methodTwo();
        someClass.methodThree();
    }
}
