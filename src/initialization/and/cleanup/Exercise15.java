package initialization.and.cleanup;

class NonStaticInitialization {
    NonStaticInitialization(String input) {
        System.out.println("Input: " + input);
    }
}

class NonStaticInitializations {
    NonStaticInitialization string1;
    NonStaticInitialization string2;
    {
        NonStaticInitialization string1 = new NonStaticInitialization("some_string");
        NonStaticInitialization string2 = new NonStaticInitialization("some_other_string");
        System.out.println("Initialization of string1 and string2 done.");
    }
}
public class Exercise15 {
    public static void main(String[] args){
        new NonStaticInitializations();
    }
}
