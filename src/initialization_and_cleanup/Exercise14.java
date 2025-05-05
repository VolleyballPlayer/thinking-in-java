package initialization_and_cleanup;

class StaticInit {
    static String staticField1 = "some_string";
    static String staticField2;
    static {
        staticField2 = "some_other_string";
        System.out.println(staticField2 + " initialized");
    }
    StaticInit(){
        System.out.println("staticField1: " + staticField1 + ", staticField2: " + staticField2);
    }
    static void print(){
        System.out.println("Printing both: " + staticField1 + " and " + staticField2)  ;
    }
}

public class Exercise14 {
    public static void main (String[] args){
        StaticInit.print();
    }
    static StaticInit field1 = new StaticInit();
}
