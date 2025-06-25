package polymorphism;

class Rodent12{
    Rodent12(){
        System.out.println("This is Rodent");
    }
    void is_social(){
        System.out.println("social");}
    void is_herbivorous(){System.out.println("herbivorous");}
    void is_nocturnal(){System.out.println("nocturnal");}
}

class Mouse12 extends Rodent12{
    Mouse12(){
        System.out.println("This is Mouse");
    }
    public String toString(){return "Mouse features:";}
}

class Gerbil12 extends Rodent12{
    Gerbil12(){
        System.out.println("This is Gerbil");
    }
    void is_nocturnal(){System.out.println("not nocturnal");}
    public String toString(){return "Gerbil features:";}
}

class Hamster12 extends Rodent12{
    Hamster12(){
        System.out.println("This is Hamster");
    }
    void is_social(){
        System.out.println("not social");}
    void is_herbivorous(){System.out.println("not herbivorous");}
    public String toString(){return "Hamster features:";}
}

public class Exercise12 {
    public static void main(String[] args) {
        Rodent12[] rodents = {
                new Mouse12(),
                new Gerbil12(),
                new Hamster12()
        };
        for (Rodent12 r: rodents) {
            System.out.println(r);
            r.is_social();
            r.is_herbivorous();
            r.is_nocturnal();
        }

    }
}
