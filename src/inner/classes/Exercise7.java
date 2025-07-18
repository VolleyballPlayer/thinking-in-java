package inner.classes;

public class Exercise7 {
    private int a;
    private int methodA(){
        return a;
    }
    class Inner7{
        int methodOfInnerClass(){
            ++a;
            return methodA();
        }
    }
    int methodB(){
        Exercise7.Inner7 obj = new Inner7();
        obj.methodOfInnerClass();
        return a;
    }

    public static void main(String[] args) {
        Exercise7 obj = new Exercise7();
        int result = obj.methodA();
        System.out.println(result);
        int result2 = obj.methodB();
        System.out.println(result2);
    }
}
