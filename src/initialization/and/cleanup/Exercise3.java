package initialization.and.cleanup;

class DefaultConstructor{
    DefaultConstructor(){
        System.out.println("This is default constructor.");
    }
}

public class Exercise3 {
    public static void main(String[] args){
        DefaultConstructor obj = new DefaultConstructor();
    }
}
