package reusing.classes;

class ClassWithFinalMethod{
    final void someMethod(){
        System.out.println("This is some method.");
    }
}

public class Exercise21 extends ClassWithFinalMethod {
    //@Override void someMethod(){
     //   System.out.println("This is same method that cannot be override method in the base class as it is final");
    //}
}
