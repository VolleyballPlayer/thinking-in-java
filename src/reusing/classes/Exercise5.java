package reusing.classes;

class A{
    A(){
        System.out.println("I am class A");
    }
}

class B{
    B(){
        System.out.println("I am class B");
    }
}

class C extends A{
    B bMember = new B();
}

public class Exercise5 {
    public static void main(String[] args) {
        C obj = new C();
    }
}
