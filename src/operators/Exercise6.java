package operators;

public class Exercise6 {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.setName("Doggy");
        doggy.setSays("Aw!");
        doggy.showDogName();
        doggy.speak();
        System.out.println("Doggy equals spot: "+ doggy.equals(Exercise5.spot));
        System.out.println("Doggy == spot: "+ (doggy == Exercise5.spot));
        Exercise5.spot = doggy;
        System.out.println("Doggy equals spot: "+ doggy.equals(Exercise5.spot));
        System.out.println("Doggy == spot: "+ (doggy == Exercise5.spot));
    }
}
