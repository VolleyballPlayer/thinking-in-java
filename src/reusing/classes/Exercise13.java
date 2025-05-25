package reusing.classes;

class Base{
    void print(String s){
        System.out.println(s);
    }
    void print(int i){
        System.out.println(i);
    }
    void print(float f){
        System.out.println(f);
    }
}

class Derived extends Base{
    void print(boolean b){
        System.out.println(b);
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.print("a");
        obj.print(1);
        obj.print(1.1f);
        obj.print(true);
    }
}
