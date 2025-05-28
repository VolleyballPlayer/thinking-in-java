package reusing.classes;

class BaseClass{
    BaseClass(){
        System.out.println("This is class One constructor");
    }
    private static int memberStaticBase = printStaticInit("static One.memberStatic initialized");
    static int printStaticInit(String s){
        System.out.println(s);
        return 1;
    }
    private int memberNonStatic = printNonStaticInit("One.memberNonStatic initialized");
    int printNonStaticInit(String s){
        System.out.println(s);
        return 2;
    }

}

class Exercise23 extends BaseClass{
    Exercise23(){
        System.out.println("This is class Two constructor");
    }

    @Override
    public String toString() {
        return "Exercise23{" +
                "memberNonStatic=" + memberNonStatic +
                '}';
    }

    private static int memberStaticDerived = printStaticInit("static Two.memberStatic initialized");
    static int printStaticInit(String s){
        System.out.println(s);
        return 3;
    }
    private int memberNonStatic = printNonStaticInit("Two.memberNonStatic initialized");
    int printNonStaticInit(String s){
        System.out.println(s);
        return 4;
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
        Exercise23 obj = new Exercise23();
        //System.out.println(One.memberStatic); // class not loaded
    }
}


