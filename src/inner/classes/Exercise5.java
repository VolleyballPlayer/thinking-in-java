package inner.classes;

class OuterClass{
    class InnerClass{
        String s;
        String returnValue(String someString){
            return someString;
        }
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass inner_obj = obj.new InnerClass();
        OuterClass.InnerClass inner_obj_2 = obj.new InnerClass();
        String i = inner_obj.returnValue("Inner class initialization.");
        String i2 = inner_obj_2.returnValue("Inner class initialization 1.");
        System.out.println(i);
        System.out.println(i2);
        }
    }
