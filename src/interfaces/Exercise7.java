package interfaces;

class MouseImpl implements RodentIF {
    @Override
    public void is_social() {
        System.out.println("social");
    }

    @Override
    public void is_herbivorous() {
        System.out.println("herbivorous");
    }

    @Override
    public void is_nocturnal() {
        System.out.println("nocturnal");
    }

    public String toString(){return "Mouse features:";}
}

class GerbilImpl implements RodentIF {
    @Override
    public void is_nocturnal(){
        System.out.println("not nocturnal");
    }
    @Override
    public void is_social() {
        System.out.println("social");
    }

    @Override
    public void is_herbivorous() {
        System.out.println("herbivorous");
    }
    public String toString(){return "Gerbil features:";}
}

class HamsterImpl implements RodentIF {
    @Override
    public void is_social(){
        System.out.println("not social");}
    @Override
    public void is_herbivorous(){System.out.println("not herbivorous");}
    @Override
    public void is_nocturnal(){
        System.out.println("not nocturnal");
    }
    public String toString(){return "Hamster features:";}
}

public class Exercise7 {
    public static void main(String[] args) {
        RodentIF[] rodents = {
                new MouseImpl(),
                new GerbilImpl(),
                new HamsterImpl()
        };
        for (RodentIF r: rodents) {
            System.out.println(r);
            r.is_social();
            r.is_herbivorous();
            r.is_nocturnal();
        }

    }
}
