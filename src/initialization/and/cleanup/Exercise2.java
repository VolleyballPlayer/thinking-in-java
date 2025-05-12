package initialization.and.cleanup;

class StringClass1 {
    String s1 = "a";
}

class StringClass2 {
    String s2;

    StringClass2() {
        s2 = "b";
    }
}

public class Exercise2 {
    public static void main(String[] args){
        StringClass1 obj_1 = new StringClass1();
        System.out.println(obj_1.s1);
        StringClass2 obj_2 = new StringClass2();
        System.out.println(obj_2.s2);
    }
}
