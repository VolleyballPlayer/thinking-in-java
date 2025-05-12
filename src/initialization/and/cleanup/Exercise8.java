package initialization.and.cleanup;

class Test{
    void printWithoutThisReference(){
        System.out.println("This is print without this reference");
        printWithThisReference();
        this.printWithThisReference();
    }
    void printWithThisReference(){
        System.out.println("This is print with this reference");
    }
}

public class Exercise8 {
    public static void main(String[] args){
        Test test = new Test();
        test.printWithoutThisReference();
    }
}
