package reusing.classes;

class Amphibian{
    void jump(){
        System.out.println("Amphibian jumps");
    }

    void sleep(){
        System.out.println("Amphibian sleeps");
    }
    static void eat(Amphibian a){
        System.out.println("Amphibian eats");
        a.sleep();
    }
}

//Exercise16
public class Frog extends Amphibian{
    public static void main(String[] args) {
        Frog f = new Frog();
        f.jump();
        Amphibian.eat(f);
    }
}