package interfaces;

class Meal {
    Meal() {System.out.println("Meal()");}
}
class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}
class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}
class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}
class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}

interface FastFood{
    void prepare_meal();
}

class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() { System.out.println("Sandwich()"); }
    @Override
    public void prepare_meal(){
        System.out.println("Preparing HotDog");
    }
}

public class Exercise8{
    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.prepare_meal();
    }
}
