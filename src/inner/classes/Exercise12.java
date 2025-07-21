package inner.classes;

interface AnonymousClass{
    int methodOfInnerClass();
}

public class Exercise12 {
    private int a;
    private int methodA(){
        return a;
    }

    AnonymousClass methodB(){
        return new AnonymousClass(){
            @Override
            public int methodOfInnerClass(){
                ++a;
                return methodA();
            }
        };
    }

    public static void main(String[] args) {
        Exercise12 obj = new Exercise12();
        int result = obj.methodA();
        System.out.println(result);
        AnonymousClass result2 = obj.methodB();
        System.out.println(result2.methodOfInnerClass());
    }
}