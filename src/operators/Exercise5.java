package operators;

public class Exercise5 {

    public static Dog spot = new Dog();
    public static Dog scruffy = new Dog();

    public static void main(String[] args) {
        spot.setName("Spot");
        spot.setSays("Ruff!");
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showDogName();
        spot.speak();
        scruffy.showDogName();
        scruffy.speak();
    }
}
