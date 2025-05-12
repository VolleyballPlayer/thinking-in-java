package initialization.and.cleanup;

public class Exercise9 {
    Exercise9(String s){
        this(1);
        System.out.println("Constructor with string: " + s);
    }
    Exercise9(int i){
        System.out.println("Constructor with integer: " + i);
    }
    public static void main(String[] args){
        Exercise9 obj = new Exercise9("some_string");
    }
}
