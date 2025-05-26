package reusing.classes;

//Exercise16
public class FrogOverride extends Amphibian{

    @Override
    void jump(){
        System.out.println("Frog jumps");
    }

    @Override
    void sleep() {
        System.out.println("Frog sleeps");
    }

    static void eat(Amphibian a){
        System.out.println("Frog eats");
    }

    public static void main(String[] args) {
        FrogOverride f = new FrogOverride();
        f.jump();
        eat(f);
        Amphibian.eat(f);
    }
}