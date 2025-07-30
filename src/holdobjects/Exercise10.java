package holdobjects;

import java.util.ArrayList;
import java.util.Iterator;


class Rodent{
    void is_social(){
        System.out.println("social");}
    void is_herbivorous(){System.out.println("herbivorous");}
    void is_nocturnal(){System.out.println("nocturnal");}
}

class Mouse extends Rodent{
    public String toString(){return "Mouse features:";}
}

class Gerbil10 extends Rodent{
    void is_nocturnal(){System.out.println("not nocturnal");}
    public String toString(){return "Gerbil10 features:";}
}

class Hamster extends Rodent{
    void is_social(){
        System.out.println("not social");}
    void is_herbivorous(){System.out.println("not herbivorous");}
    public String toString(){return "Hamster features:";}
}

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<Rodent>();
        rodents.add(new Mouse());
        rodents.add(new Gerbil10());
        rodents.add(new Hamster());

        Iterator<Rodent> it = rodents.iterator();
        while(it.hasNext()) {
            Rodent r = it.next();
            System.out.println(r);
            r.is_social();
            r.is_herbivorous();
            r.is_nocturnal();
        }
    }
}
