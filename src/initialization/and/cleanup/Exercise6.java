package initialization.and.cleanup;

class DogWithTwoArguments {
    void bark(int a, String b){
        System.out.println("Barking. Primitive type int: " + a + " Primitive type string: " + b);
    }
    void bark(String a, int b){
        System.out.println("Howling. Primitive type string: " + a + " Primitive type int: " + b);
    }
}

public class Exercise6 {
    public static void main(String[] args){
        DogWithTwoArguments sparky = new DogWithTwoArguments();
        sparky.bark(1, "some_string");
        sparky.bark("some_string", 1);
    }
}
