package polymorphism;

class Cycle{
    public void ride(Cycle c){
    System.out.println("Riding " + c);
    }
}

class Unicycle extends Cycle{
    public String toString() {
        return "Unicycle";
    }
}

class Bicycle extends Cycle{
    public String toString() {
        return "Bicycle";
    }
}

class Tricycle extends Cycle{
    public String toString() {
        return "Tricycle";
    }
}

public class Exercise1 {

    static void ride(Cycle c) {
        c.ride(c);
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
