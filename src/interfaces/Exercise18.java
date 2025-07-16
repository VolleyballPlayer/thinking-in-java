package interfaces;

interface Cycle{
    void get_number_of_wheels();
}

interface CycleFactory{
    Cycle ride();
}

class Unicycle implements Cycle{
    public void get_number_of_wheels(){
        System.out.println("I am riding a cycle with one wheel");
    }
}

class UnicycleFactory implements CycleFactory{
    public Cycle ride(){
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void get_number_of_wheels(){
        System.out.println("I am riding a cycle with two wheels");
    }
}

class BicycleFactory implements CycleFactory{
    public Cycle ride(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void get_number_of_wheels(){
        System.out.println("I am riding a cycle with three wheels");
    }
}

class TricycleFactory implements CycleFactory{
    public Cycle ride(){
        return new Tricycle();
    }
}

public class Exercise18 {
    static void chooseCycle(CycleFactory fact){
        Cycle c = fact.ride();
        c.get_number_of_wheels();
    }

    public static void main(String[] args) {
        chooseCycle(new UnicycleFactory());
        chooseCycle(new BicycleFactory());
        chooseCycle(new TricycleFactory());
    }
}
