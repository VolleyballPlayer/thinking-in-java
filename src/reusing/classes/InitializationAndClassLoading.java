package reusing.classes;

class One{
    One(){
        System.out.println("This is class One constructor");
    }
    private static int memberStatic = printStaticInit("static One.memeberStatic initialized");
    static int printStaticInit(String s){
        System.out.println(s);
        return 11;
    }
    private int memberNonStatic = printNonStaticInit("One.memeberNonStatic initialized");
    int printNonStaticInit(String s){
        System.out.println(s);
        return 11;
    }

}

class Two extends One{
    Two(){
        System.out.println("This is class Two constructor");
    }
    private static int memberStatic = printStaticInit("static Two.memeberStatic initialized");
    static int printStaticInit(String s){
        System.out.println(s);
        return 11;
    }
    private int memberNonStatic = printNonStaticInit("Two.memeberNonStatic initialized");
    int printNonStaticInit(String s){
        System.out.println(s);
        return 11;
    }
}

public class InitializationAndClassLoading {
    public static void main(String[] args) {
        System.out.println("This is main method");
        Two obj = new Two();
    }

}


