package polymorphism;

class SharedRodent{
    public static long counter;
}

class Rodent14{
    Rodent14(){
        System.out.println("This is Rodent");
    }
    void is_social(){
        System.out.println("social");}
    void is_herbivorous(){System.out.println("herbivorous");}
    void is_nocturnal(){System.out.println("nocturnal");}
}

class Mouse14 extends Rodent14{

    Mouse14(){
        System.out.println(++SharedRodent.counter + ". This is Mouse");
    }
    public String toString(){return "Mouse features:";}
}

class Gerbil14 extends Rodent14{
    Gerbil14(){
        System.out.println(++SharedRodent.counter + ". This is Gerbil");
    }
    void is_nocturnal(){System.out.println("not nocturnal");}
    public String toString(){return "Gerbil features:";}
}

class Hamster14 extends Rodent14{
    Hamster14(){
        System.out.println(++SharedRodent.counter + ". This is Hamster");
    }
    void is_social(){
        System.out.println("not social");}
    void is_herbivorous(){System.out.println("not herbivorous");}
    public String toString(){return "Hamster features:";}
}

public class Exercise14 {
    public static void main(String[] args) {
        Rodent14[] rodents = {
                new Mouse14(),
                new Gerbil14(),
                new Hamster14()
        };
        for (Rodent14 r: rodents) {
            System.out.println(r);
            r.is_social();
            r.is_herbivorous();
            r.is_nocturnal();
        }

    }
}
