package reusing.classes;

class Grandma {
    Grandma() {
        System.out.println("Grandma is born before mom."); }
}

class Mom extends Grandma {
    Mom() { System.out.println("Mom is born before daughter."); }
}

class Daugther extends Mom{
    Daugther() {
        System.out.println("Daughter is born the last.");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Daugther x = new Daugther();
    }
}
