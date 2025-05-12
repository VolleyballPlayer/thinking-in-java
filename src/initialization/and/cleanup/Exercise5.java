package initialization.and.cleanup;

class Dog {
    void bark(int a){
        System.out.println("Barking. Primitive type int: " + a);
    }
    void bark(String a){
        System.out.println("Howling. Primitive type string: " + a);
    }
}

public class Exercise5 {
    public static void main(String[] args){
        Dog sparky = new Dog();
        sparky.bark(1);
        sparky.bark("some_string");
    }
}
