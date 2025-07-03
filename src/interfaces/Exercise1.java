package interfaces;

abstract class Rodent{
    abstract void is_social();
    abstract void is_herbivorous();
    abstract void is_nocturnal();
}

class Mouse extends Rodent {
    void is_social(){System.out.println("social");}
    void is_herbivorous(){System.out.println("herbivorous");}
    void is_nocturnal(){System.out.println("nocturnal");}
    public String toString(){return "Mouse features:";}
}

class Gerbil extends Rodent {
    void is_social(){System.out.println("social");}
    void is_herbivorous(){System.out.println("herbivorous");}
    void is_nocturnal(){System.out.println("not nocturnal");}
    public String toString(){return "Gerbil features:";}
}

class Hamster extends Rodent {
    void is_social(){
        System.out.println("not social");}
    void is_herbivorous(){System.out.println("not herbivorous");}
    void is_nocturnal(){System.out.println("nocturnal");}
    public String toString(){return "Hamster features:";}
}

public class Exercise1 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (Rodent r: rodents) {
            System.out.println(r);
            r.is_social();
            r.is_herbivorous();
            r.is_nocturnal();
        }

    }
}
