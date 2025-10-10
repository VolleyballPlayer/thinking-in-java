package errorhandling;

class Level1 extends Exception{}
class Level2 extends Level1{}
class Level3 extends Level2{}

class A{
    void f() throws Level1{
        throw new Level1();
    }
}

class B extends A{
    void f() throws Level2{
        throw new Level2();
    }
}

class C extends B {
    void f() throws Level3 {
        throw new Level3();
    }
}

public class Exercise25 {
    public static void main(String[] args) throws Level1 {
        A obj = new C();
        try{
            obj.f();
        } catch(Level3 e){
            System.out.println("Level3 exception caught");
            e.printStackTrace();
        } catch(Level2 e){
            System.out.println("Level2 exception caught");
            e.printStackTrace();
        } catch(Level1 e){
            System.out.println("Level1 exception caught");
            e.printStackTrace();
        }

    }
}

