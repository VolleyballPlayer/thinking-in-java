package interfaces;
import polymorphism.Note;

interface Instrument10{
    void adjust();
}

interface Playable{
    void play(Note n);
}

class Wind10 implements Instrument10, Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()"); }
}
class Percussion10 implements Instrument10, Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()"); }
}
class Stringed10 implements Instrument10, Playable {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass10 extends Wind10 {
    public String toString() {
        return "Brass";
    }
}

class Woodwind10 extends Wind10 {
    public String toString() { return "Woodwind"; }
}


public class Exercise10 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    static void tune(Playable i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
// Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind10(),
                new Percussion10(),
                new Stringed10(),
                new Brass10(),
                new Woodwind10()
        };
        tuneAll(orchestra);
    }
}
