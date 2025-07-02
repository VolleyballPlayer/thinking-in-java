package polymorphism;

class Cycle17{
    int numberOfWheels = 0;
    public void ride(Cycle17 c){
        System.out.println("Riding " + c);
    }
    int wheels(){
        return numberOfWheels;
    }
}

class Unicycle17 extends Cycle17{
    int numberOfWheels = 1;
    public String toString() {
        return "Unicycle" ;
    }
    @Override
    int wheels(){
        return numberOfWheels;
    }
    void balance(){
        System.out.println("This is a balance method of unicycle");
    }

}

class Bicycle17 extends Cycle17{
    int numberOfWheels = 2;
    public String toString() {
        return "Bicycle";
    }
    @Override
    int wheels(){
        return numberOfWheels;
    }
    void balance(){
        System.out.println("This is a balance method of bicycle");
    }
}

class Tricycle17 extends Cycle17{
    private int numberOfWheels = 3;
    public String toString() {
        return "Tricycle";
    }
    @Override
    int wheels(){
        return numberOfWheels;
    }
}

public class Exercise17 {

    static void ride(Cycle17 c) {
        c.ride(c);
        int w = c.wheels();
        System.out.println("Number of wheels is " + w);
    }
    public static void main(String[] args) {
        Cycle17[] cycle = {new Unicycle17(),
                new Bicycle17(),
                new Tricycle17()
        };
        //Unicycle17 x = (Unicycle17) cycle[0];
        //x.balance();

        ((Unicycle17)cycle[0]).balance();
        ((Bicycle17)cycle[1]).balance();

        //cycle[0].balance();
        //cycle[1].balance();
        //cycle[2].balance();
    }
}