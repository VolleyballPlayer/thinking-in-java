package initialization.and.cleanup;

public class Exercise19 {
    static void f(String ... args){
        for (String s: args){
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        f("a", "b", "c");
        f(new String[]{"c", "d", "e"});
    }
}
