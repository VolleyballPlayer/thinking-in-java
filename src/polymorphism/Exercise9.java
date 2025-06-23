package polymorphism;

class Rodent{
    void is_social(){
        System.out.println("social");}
    void is_herbivorous(){System.out.println("herbivorous");}
    void is_nocturnal(){System.out.println("nocturnal");}
}

class Mouse extends Rodent{
    public String toString(){return "Mouse features:";}
}

class Gerbil extends Rodent{
    void is_nocturnal(){System.out.println("not nocturnal");}
    public String toString(){return "Gerbil features:";}
}

class Hamster extends Rodent{
    void is_social(){
        System.out.println("not social");}
    void is_herbivorous(){System.out.println("not herbivorous");}
    public String toString(){return "Hamster features:";}
}

public class Exercise9 {
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
