package initialization.and.cleanup;

class DefaultConstructorOverload{
    DefaultConstructorOverload(){
        System.out.println("This is default constructor.");
    }
    DefaultConstructorOverload(String s){
        System.out.println("This is default constructor with string argument: " + s);
    }
}

public class Exercise4 {
    public static void main(String[] args){
        DefaultConstructorOverload obj = new DefaultConstructorOverload();
        DefaultConstructorOverload obj1 = new DefaultConstructorOverload("some_string");
    }
}
