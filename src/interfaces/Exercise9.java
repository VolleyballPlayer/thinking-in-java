package interfaces;
import polymorphism.Note;

abstract class Instrument{
    abstract void play(Note n);
    abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()"); }
}
class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()"); }
}
class Stringed extends Instrument {
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

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}


public class Exercise9 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
