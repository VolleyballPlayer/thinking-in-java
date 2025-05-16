package reusing.classes;

class SimpleClass{
    private String simpleString;
    SimpleClass(){
        System.out.println("SimpleClass()");
        simpleString = "Constructed";
    }
    public String toString(){ return simpleString; }
}
public class Exercise1 {
    private SimpleClass simple;
    public String toString(){
        if(simple == null)
            simple = new SimpleClass();
        return "simple string is " + simple;
    }

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        System.out.println(obj);
    }
}
