package polymorphism;

class Cycle{
    int numberOfWheels = 0;
    public void ride(Cycle c){
    System.out.println("Riding " + c);
    }
    int wheels(){
        return numberOfWheels;
    }
}

class Unicycle extends Cycle{
    int numberOfWheels = 1;
    public String toString() {
        return "Unicycle" ;
    }
    @Override
    int wheels(){
        return numberOfWheels;
    }

}

class Bicycle extends Cycle{
    int numberOfWheels = 2;
    public String toString() {
        return "Bicycle";
    }
    @Override
    int wheels(){
        return numberOfWheels;
    }
}

class Tricycle extends Cycle{
    private int numberOfWheels = 3;
    public String toString() {
        return "Tricycle";
    }
    @Override
    int wheels(){
        return numberOfWheels;
    }
}

public class Exercise1 {

    static void ride(Cycle c) {
        c.ride(c);
        int w = c.wheels();
        System.out.println("Number of wheels is " + w);
    }
    public static void main(String[] args) {
    Unicycle unicycle = new Unicycle();
    Bicycle bicycle = new Bicycle();
    Tricycle tricycle = new Tricycle();
    ride(unicycle);
    ride(bicycle);
    ride(tricycle);
    }
}
