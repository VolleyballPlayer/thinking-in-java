package holdobjects;
import java.util.*;

class Dog{
    String dogName;
    Dog(String name){
        dogName = name;
        System.out.println("This is Dog named " + name);
    }
    public String toString(){ return dogName;}
}

public class Exercise7 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Les"));
        dogs.add(new Dog("Luna"));
        dogs.add(new Dog("Maza"));
        List<Dog> firstTwoDogs = dogs.subList(0,2);
        dogs.removeAll(firstTwoDogs);
        System.out.println(dogs);
    }
}
